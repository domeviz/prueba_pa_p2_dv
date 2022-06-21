package com.uce.edu.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.Propietario;
import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.repository.IMatriculaRepository;
import com.uce.edu.demo.repository.IVehiculoRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	@Qualifier("liviano")
	private IVehiculoService livianoService;
	
	@Autowired
	@Qualifier("pesado")
	private IVehiculoService pesadoService;
	
	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	
	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	
	@Override
	public void matricularVehiculo(Vehiculo vehiculo, Propietario propietario) {
		// TODO Auto-generated method stub
		BigDecimal vm=null;
		this.iVehiculoRepository.insertar(vehiculo);
		Vehiculo v=this.iVehiculoRepository.buscar(vehiculo.getPlaca());
		Matricula m=new Matricula();
		m.setFechaMatricula(LocalDateTime.now());
		m.setPropietario(propietario);
		m.setVehiculo(vehiculo);
		this.iMatriculaRepository.buscar(m);
		
		if(v.getTipo().equals("L")) {
			//Liviano
			vm=this.livianoService.valorMatricula(m, v.getPlaca(), v.getPrecio());
		} else {
			//Pesado
			vm=this.pesadoService.valorMatricula(m, v.getPlaca(), v.getPrecio());
		}
		m.setValorMatricula(vm);
		if(vm.compareTo(new BigDecimal(2000))==1) {
			vm=m.getValorMatricula().multiply(new BigDecimal(7)).divide(new BigDecimal(100));
		}
		m.setValorMatricula(vm);
		
		System.out.println("El vehiculo "+v.getPlaca()+" ha sido matriculado");
		System.out.println("Valor de matricula: "+vm);
		System.out.println(m);
	}

}

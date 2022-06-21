package com.uce.edu.demo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.repository.IMatriculaRepository;
import com.uce.edu.demo.repository.IVehiculoRepository;

@Service
@Qualifier("liviano")
public class VehiculoLivianoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	
	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	
	@Override
	public BigDecimal valorMatricula(Matricula matricula,String placa, BigDecimal precio) {
		// TODO Auto-generated method stub
		Vehiculo v=this.iVehiculoRepository.buscar(placa);
		Matricula m=this.iMatriculaRepository.buscar(matricula);
		BigDecimal vm=m.getValorMatricula();
		vm=v.getPrecio().multiply(new BigDecimal(14)).divide(new BigDecimal(100));
		return vm;
	}

}

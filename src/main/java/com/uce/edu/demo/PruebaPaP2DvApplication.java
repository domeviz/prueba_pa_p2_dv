package com.uce.edu.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Propietario;
import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.service.IMatriculaGestorService;
import com.uce.edu.demo.service.IPropietarioService;
import com.uce.edu.demo.service.IVehiculoService;

@SpringBootApplication
public class PruebaPaP2DvApplication implements CommandLineRunner{

	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IMatriculaGestorService iMatriculaGestorService;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2DvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Prueba Unidad 1");
		
		Propietario p=new Propietario();
		p.setCedula("1234567");
		p.setNombre("Domenica");
		p.setApellido("Vizcarra");
		
		this.iPropietarioService.crearPropietario(p);
		
		Vehiculo v=new Vehiculo();
		v.setMarca("Nissan");
		v.setModelo("12344");
		v.setPlaca("ABC123");
		v.setTipo("L");
		v.setPrecio(new BigDecimal(200000));
		
		this.iVehiculoService.insertar(v);
		
		v.setMarca("Chevrolet");
		v.setPrecio(new BigDecimal(40000));
		
		this.iVehiculoService.actualizar(v);
		
		this.iMatriculaGestorService.generar("1234567", "ABC123");
		
	}

}

package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {

	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la BD "+propietario);
	}

	@Override
	public Propietario buscar(Propietario propietario) {
		// TODO Auto-generated method stub
		System.out.println("Se ha encontrado el propietario "+propietario);
		Propietario p=new Propietario();
		p.setCedula("1234567");
		p.setNombre("Domenica");
		p.setApellido("Vizcarra");
		return p;
	}

}

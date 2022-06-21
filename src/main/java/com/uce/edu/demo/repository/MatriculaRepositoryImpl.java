package com.uce.edu.demo.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository {

	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la BD "+matricula);
	}

	@Override
	public Matricula buscar(Matricula matricula) {
		// TODO Auto-generated method stub
		Matricula m=new Matricula();
		m.setFechaMatricula(LocalDateTime.now());
		return m;
	}


}

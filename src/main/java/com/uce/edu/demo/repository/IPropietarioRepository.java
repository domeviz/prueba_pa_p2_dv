package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Propietario;

public interface IPropietarioRepository {

	public void insertar(Propietario propietario);

	public Propietario buscar(Propietario propietario);
	
}

package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Vehiculo;

public interface IVehiculoRepository {

	public void insertar(Vehiculo vehiculo);

	public Vehiculo buscar(String placa);

	public void actualizar(Vehiculo vehiculo);

	public void eliminar(Vehiculo vehiculo);
}

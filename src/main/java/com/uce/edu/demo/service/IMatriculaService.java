package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Propietario;
import com.uce.edu.demo.modelo.Vehiculo;

public interface IMatriculaService {

	public void matricularVehiculo(Vehiculo vehiculo, Propietario propietario);
}

package com.uce.edu.demo.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la BD "+ vehiculo);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo v=new Vehiculo();
		v.setMarca("Nissan");
		v.setModelo("12344");
		v.setPlaca("ABC123");
		v.setTipo("L");
		v.setPrecio(new BigDecimal(200000));
		return v;
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la BD: "+vehiculo);
	}

	@Override
	public void eliminar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la BD "+vehiculo);
	}

}

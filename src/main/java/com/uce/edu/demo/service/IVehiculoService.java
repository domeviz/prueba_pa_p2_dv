package com.uce.edu.demo.service;

import java.math.BigDecimal;

import com.uce.edu.demo.modelo.Matricula;

public interface IVehiculoService {
	
	public BigDecimal valorMatricula(Matricula matricula,String placa, BigDecimal precio);
}

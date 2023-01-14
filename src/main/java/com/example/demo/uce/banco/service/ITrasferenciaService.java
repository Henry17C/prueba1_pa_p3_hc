package com.example.demo.uce.banco.service;

import java.math.BigDecimal;

import com.example.demo.uce.banco.modelo.Cuenta;

public interface ITrasferenciaService {
	public void trasferir (String  cuentaOrigen, String  cuentaDestino, BigDecimal monto);
	
	

}

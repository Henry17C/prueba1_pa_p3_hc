package com.example.demo.uce.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.banco.modelo.Cuenta;
@Service
public class TrasferenciaServiceImpl implements ITrasferenciaService{

	@Autowired
	private ICuentaService cuentaService;
	@Override
	public void trasferir(String cuentaOrigen, String cuentaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		
		
		Cuenta cuentaO= this.cuentaService.buscar(cuentaOrigen);
		Cuenta cuentaD= this.cuentaService.buscar(cuentaDestino);
		//-1 cuando el valor de la izquierda es menor
				//0 son iguales
				//1 valor derecha es mayor 
		
		if(cuentaO.getSaldo().compareTo(monto)==1) {
			System.out.println("Iniciando tranferencia..");
			BigDecimal comision=monto.multiply(new BigDecimal(0.05));
			
			cuentaO.setSaldo(cuentaO.getSaldo().subtract(comision));
			cuentaO.setSaldo(cuentaO.getSaldo().subtract(monto));
			
			
			cuentaD.setSaldo(cuentaD.getSaldo());
		}
		if(cuentaO.getSaldo().compareTo(monto)==-1) {
			System.out.println("Saldo insuficiente");
		}
		
		
		
	}


	

}

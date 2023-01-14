package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.banco.modelo.Cuenta;
import com.example.demo.uce.banco.service.ICuentaService;

@SpringBootApplication
public class Prueba1PaP3HcApplication implements CommandLineRunner{

	
	
	public static void main(String[] args) {
		SpringApplication.run(Prueba1PaP3HcApplication.class, args);
	}
	
	
	@Autowired
	ICuentaService cuentaService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//1 CREAR CUENTAS BANCARIAS
		//cuenta1
		Cuenta cuenta1= new Cuenta();
		cuenta1.setCedula("1751");
		cuenta1.setNumero("1");
		cuenta1.setSaldo(new BigDecimal(2000));
		cuenta1.setTipo("ahorros");
		
		
		//cuenta2
		Cuenta cuenta2= new Cuenta();
		cuenta2.setCedula("1752");
		cuenta2.setNumero("2");
		cuenta2.setSaldo(new BigDecimal(3000));
		cuenta2.setTipo("corriente");
		//insercion de cuentas
		this.cuentaService.insertar(cuenta2);
		this.cuentaService.insertar(cuenta1);
		
	}

}

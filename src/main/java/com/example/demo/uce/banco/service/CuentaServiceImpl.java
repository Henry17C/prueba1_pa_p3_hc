package com.example.demo.uce.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.banco.modelo.Cuenta;
import com.example.demo.uce.banco.repo.ICuentaRepo;
@Service
public class CuentaServiceImpl implements ICuentaService{

	@Autowired
	private ICuentaRepo bancoRepo;
	@Override
	public void insertar(Cuenta banco) {
		// TODO Auto-generated method stub
		this.bancoRepo.insertar(banco);
		
	}

	@Override
	public void actualizar(Cuenta banco) {
		// TODO Auto-generated method stub
		this.bancoRepo.actualizar(banco);
	}

	@Override
	public Cuenta buscar(String numero) {
		// TODO Auto-generated method stub
		return this.bancoRepo.buscar(numero);
	}

	@Override
	public void borrar(String numero) {
		// TODO Auto-generated method stub
		this.bancoRepo.borrar(numero);
	}

}

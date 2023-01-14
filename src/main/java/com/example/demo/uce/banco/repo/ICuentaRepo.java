package com.example.demo.uce.banco.repo;

import com.example.demo.uce.banco.modelo.Cuenta;

public interface ICuentaRepo {
	
	public void insertar (Cuenta banco);
	public void actualizar (Cuenta banco);
	public Cuenta buscar(String numero);
	public void borrar(String numero);
	

}

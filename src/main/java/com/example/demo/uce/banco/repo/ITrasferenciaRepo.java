package com.example.demo.uce.banco.repo;

import com.example.demo.uce.banco.modelo.Cuenta;
import com.example.demo.uce.banco.modelo.Transferencia;

public interface ITrasferenciaRepo {
	public void insertar (Transferencia transferencia);
	public void actualizar (Transferencia transferencia);
	public Transferencia buscar(Integer Id);
	public void borrar(Integer Id);

}

package com.example.demo.uce.banco.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.banco.modelo.Cuenta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class CuentaRepoImpl implements ICuentaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertar(Cuenta banco) {
		this.entityManager.persist(banco);
		
	}

	@Override
	public void actualizar(Cuenta banco) {
		// TODO Auto-generated method stub
		this.entityManager.merge(banco);
		
	}

	@Override
	public Cuenta buscar(String numero) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Cuenta.class, numero);
	}

	@Override
	public void borrar(String numero) {
		Cuenta banco= this.buscar(numero);
		this.entityManager.remove(banco);
		
	}

}

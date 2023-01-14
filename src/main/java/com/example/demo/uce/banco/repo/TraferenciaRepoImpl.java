package com.example.demo.uce.banco.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.banco.modelo.Transferencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class TraferenciaRepoImpl implements ITrasferenciaRepo{


	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(transferencia);
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.entityManager.merge(transferencia);
		
	}

	@Override
	public Transferencia buscar(Integer Id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Transferencia.class, Id);
	}

	@Override
	public void borrar(Integer Id) {
		Transferencia transferencia = this.buscar(Id);
		this.entityManager.remove(transferencia);
		
	}

}

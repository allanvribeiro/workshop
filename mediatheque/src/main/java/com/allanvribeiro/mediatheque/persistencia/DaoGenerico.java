package com.allanvribeiro.mediatheque.persistencia;

import javax.persistence.EntityManager;

import com.allanvribeiro.mediatheque.modelo.EntidadePersistencia;

public abstract class DaoGenerico<T extends EntidadePersistencia> {

	public T buscar(Class<T> clazz, Long id) {
		EntityManager em = FabricaConexao.getEntityManager();
		T resultado = null;
		
		try {
			em.getTransaction().begin();

			resultado = em.find(clazz, id);

			em.getTransaction().commit();
			
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
		return resultado;
	}
	
	public void salvar(T entidade) {
		EntityManager em = FabricaConexao.getEntityManager();

		try {
			em.getTransaction().begin();

			em.persist(entidade);

			em.getTransaction().commit();
			
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}
	
	public void excluir(T entidade) {
		EntityManager em = FabricaConexao.getEntityManager();

		try {
			em.getTransaction().begin();

			em.remove(entidade);

			em.getTransaction().commit();
			
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

	public void atualizar(T entidade) {
		EntityManager em = FabricaConexao.getEntityManager();

		try {
			em.getTransaction().begin();

			em.merge(entidade);

			em.getTransaction().commit();
			
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}
}

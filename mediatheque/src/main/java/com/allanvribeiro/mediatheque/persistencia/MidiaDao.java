package com.allanvribeiro.mediatheque.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.allanvribeiro.mediatheque.modelo.Midia;

public class MidiaDao extends DaoGenerico<Midia>{

	public Midia buscar(Long id) {
		return buscar(Midia.class, id);
	}

	public List<Midia> listar(String termoDeBusca) {
		
		String sql = "select * from midia where nome like ?";
		EntityManager em = FabricaConexao.getEntityManager();
		Query consulta = em.createNativeQuery(sql, Midia.class);
		consulta.setParameter(1, "%" + termoDeBusca + "%");
		
		return consulta.getResultList();		
	}
}

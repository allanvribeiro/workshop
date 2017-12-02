package com.allanvribeiro.mediatheque.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FabricaConexao {
	
	
	public static EntityManager getEntityManager() {
		EntityManagerFactory fabrica =  Persistence.createEntityManagerFactory("mediatheque");
		return fabrica.createEntityManager();
	}

}

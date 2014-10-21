package br.com.siga.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.siga.model.Cliente;
import br.com.siga.util.JPAUtil;

public class ClienteDAO extends GenericDAO<Cliente>{

	public ClienteDAO(Class<Cliente> classe) {
		super(classe);
	}
	
	public List<Cliente> buscaPorNome(String nome) {
		EntityManager em = new JPAUtil().getEntityManager();
		List<Cliente> instancia = em.createQuery("select c from Cliente c where c.nome like :nome ").setParameter("nome","%"+nome+"%").getResultList();
		em.close();
		return instancia;
	}

}

package br.com.siga.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.siga.model.Veiculo;
import br.com.siga.util.JPAUtil;

public class VeiculoDAO extends GenericDAO<Veiculo> {
	
	public VeiculoDAO(Class<Veiculo> classe) {
		super(classe);
	}
	
	public List<Veiculo> buscaPorNome(String nome) {
		EntityManager em = new JPAUtil().getEntityManager();
		List<Veiculo> instancia = em.createQuery("select c from Veiculo c where c.nome like :nome ").setParameter("nome","%"+nome+"%").getResultList();
		em.close();
		return instancia;
	}

}

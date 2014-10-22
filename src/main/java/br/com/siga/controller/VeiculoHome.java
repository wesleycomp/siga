package br.com.siga.controller;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import br.com.siga.dao.VeiculoDAO;
import br.com.siga.entityEnum.Marca;
import br.com.siga.model.Veiculo;


@ManagedBean
@ViewScoped
public class VeiculoHome implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Veiculo veiculo = new Veiculo();
	private Long id;
	VeiculoDAO veiculoDAO = new VeiculoDAO(Veiculo.class);

	public VeiculoHome() {
	}

	public String salvar(){
		System.out.println("Id:"+this.veiculo.getId());
		System.out.println("Nome:"+this.veiculo.getNome());
		System.out.println("Renavan:"+this.veiculo.getRenavan());
		System.out.println("Placa:"+this.veiculo.getPlaca());
		System.out.println("Cor:"+this.veiculo.getCor());
		System.out.println("Conservação:"+this.veiculo.getConservacao());
			this.veiculoDAO.atualiza(this.veiculo);
		return "veiculoList?faces-redirect=true";
	}
	
	public List<Marca> getMarcas() {
		return Arrays.asList(Marca.values());
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
//	public void teste(){
//		System.out.println("Hover Cortez Leite");
//	}
//	
	
}

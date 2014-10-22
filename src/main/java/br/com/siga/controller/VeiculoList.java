package br.com.siga.controller;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.siga.dao.VeiculoDAO;
import br.com.siga.model.Veiculo;
import br.com.siga.util.JsfUtil;

@ManagedBean
@ViewScoped
public class VeiculoList implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Veiculo> veiculos;
	private String nome;
	private Veiculo veiculo = new Veiculo();
    VeiculoDAO veiculoDAO = new VeiculoDAO(Veiculo.class);

	public VeiculoList() {}
	
	public void consultar(){
		veiculos = new LinkedList<Veiculo>();
		this.veiculos = this.veiculoDAO.listaTodos();
	}
	
	public void consultarPorNome(){
		veiculos = new LinkedList<Veiculo>();
		this.veiculos = this.veiculoDAO.buscaPorNome(this.nome);
	}
	
	public void excluir(){
		this.veiculoDAO.remove(this.veiculo);
		JsfUtil.adicionarMensagem("Veiculo excluído com sucesso!");
		consultar();
	}
	
	public List<Veiculo> getVeiculos() {
		return this.veiculos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	

}
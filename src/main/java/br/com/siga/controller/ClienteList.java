package br.com.siga.controller;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.siga.dao.ClienteDAO;
import br.com.siga.model.Cliente;
import br.com.siga.util.JsfUtil;

@ManagedBean
@ViewScoped
public class ClienteList implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Cliente> clientes;
	private String nome;
	private Cliente cliente = new Cliente();
	ClienteDAO clienteDAO = new ClienteDAO(Cliente.class);

	public ClienteList() {}
	
	public void consultar(){
		clientes = new LinkedList<Cliente>();
		this.clientes = this.clienteDAO.listaTodos();
	}
	
	public void consultarPorNome(){
		clientes = new LinkedList<Cliente>();
		this.clientes = this.clienteDAO.buscaPorNome(this.nome);
	}
	
	public void excluir(){
		this.clienteDAO.remove(this.cliente);
		JsfUtil.adicionarMensagem("Cliente excluído com sucesso!");
		consultar();
	}
	
	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	

}

package br.com.siga.controller;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import br.com.siga.dao.ClienteDAO;
import br.com.siga.entityEnum.Sexo;
import br.com.siga.model.Cliente;


@ManagedBean
@ViewScoped
public class ClienteHome implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Cliente cliente = new Cliente();
	private Long id;
	ClienteDAO clienteDAO = new ClienteDAO(Cliente.class);

	public ClienteHome() {
	}

	public String salvar(){
		System.out.println("Nome:"+this.cliente.getId());
		System.out.println("Nome:"+this.cliente.getNome());
		System.out.println("Rg:"+this.cliente.getRg());
		System.out.println("Endereco:"+this.cliente.getEndereco());
			this.clienteDAO.atualiza(this.cliente);
		return "clienteList?faces-redirect=true";
	}
	
	public List<Sexo> getSexos() {
		return Arrays.asList(Sexo.values());
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public void teste(){
		System.out.println("Hover Cortez Leite");
	}
	
	
}

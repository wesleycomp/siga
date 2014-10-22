package br.com.siga.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.siga.entityEnum.Marca;

@Entity
@Table
public class Veiculo {

	private Long id;
	private String nome;
	private Marca marca;
	private String renavan;
	private String placa;
	private String cor;
	private String conservacao;
	private Integer valor;
	
	public Veiculo() {
	}
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}


	@Enumerated(EnumType.STRING)
	public Marca getMarca() {
		return marca;
	}



	public void setMarca(Marca marca) {
		this.marca = marca;
	}



	public String getRenavan() {
		return renavan;
	}



	public void setRenavan(String renavan) {
		this.renavan = renavan;
	}



	public String getPlaca() {
		return placa;
	}



	public void setPlaca(String placa) {
		this.placa = placa;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public String getConservacao() {
		return conservacao;
	}



	public void setConservacao(String conservacao) {
		this.conservacao = conservacao;
	}



	public Integer getValor() {
		return valor;
	}



	public void setValor(Integer valor) {
		this.valor = valor;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.valueOf(this.id);
	}
	
	
}

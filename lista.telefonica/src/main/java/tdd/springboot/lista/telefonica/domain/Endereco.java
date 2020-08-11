package tdd.springboot.lista.telefonica.domain;

import java.io.Serializable;

public class Endereco implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String logradouro;
	private int numero;
	private String complemento;

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro ;
	}

	public String getLogradouro() {
		return this.logradouro;
	}

	public void setNumero(int valor) {
		this.numero = valor;
	}

	public int getNumero() {
		return numero;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getComplemento() {
		// TODO Auto-generated method stub
		return this.complemento;
	}
	
	

}

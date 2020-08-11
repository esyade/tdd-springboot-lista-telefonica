package tdd.springboot.lista.telefonica.domain;

import java.io.Serializable;

public class Endereco implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String logradouro;
	private int numero;

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
		
	}

	public Object getComplemento() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

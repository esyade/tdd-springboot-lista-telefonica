package tdd.springboot.lista.telefonica.domain;

import java.io.Serializable;

public class Endereco implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String logradouro;

	public void setLogradouro(String logradouro) {
		// TODO Auto-generated method stub
		this.logradouro = logradouro ;
	}

	public String getLogradouro() {
		// TODO Auto-generated method stub
		return this.logradouro;
	}

	public void setNumero(Integer valor) {
		// TODO Auto-generated method stub
		
	}

	public Integer getNumero() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

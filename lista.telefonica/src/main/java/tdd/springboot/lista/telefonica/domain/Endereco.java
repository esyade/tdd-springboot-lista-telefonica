package tdd.springboot.lista.telefonica.domain;

import java.io.Serializable;

public class Endereco implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String logradouro;

	public void setLogradouro(String string) {
		// TODO Auto-generated method stub
		this.logradouro = string ;
	}

	public String getLogradouro() {
		// TODO Auto-generated method stub
		return this.logradouro;
	}
	
	

}

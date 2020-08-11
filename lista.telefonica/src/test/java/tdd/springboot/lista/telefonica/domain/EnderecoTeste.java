package tdd.springboot.lista.telefonica.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EnderecoTeste {

	private Endereco endereco;

	@BeforeEach
	void setUp() throws Exception {
		this.endereco = new Endereco();
	}

	@Test
	void verificaLogradouro() {
		
		String resultado = "Conjunto Maguari";
		this.endereco.setLogradouro(resultado);
		assertEquals(resultado, this.endereco.getLogradouro());
	}
	
	@Test
	void verificaNumero() {
		int valor = 2020;
		this.endereco.setNumero(valor);
		assertEquals(valor, this.endereco.getNumero());
	}
	
	@Test
	void verificaComplemento(){
		String complemento = "Augusto Montenegro";
		this.endereco.setComplemento(complemento);
		assertEquals(complemento, this.endereco.getComplemento());
	}
	

}

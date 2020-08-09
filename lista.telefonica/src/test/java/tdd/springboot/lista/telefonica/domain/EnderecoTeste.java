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
	void verificaLogradouroVazio() {
		
		String resultado = "Conjunto Maguari";
		this.endereco = new Endereco();
		this.endereco.setLogradouro(resultado);
		assertEquals(resultado, this.endereco.getLogradouro());
	}

}

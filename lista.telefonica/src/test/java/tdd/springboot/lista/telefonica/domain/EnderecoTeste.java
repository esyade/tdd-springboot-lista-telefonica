package tdd.springboot.lista.telefonica.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EnderecoTeste {


	@BeforeEach
	void setUp() throws Exception {
		Endereco endereco = new Endereco();
	}

	@Test
	void verificaLogradouroVazio() {
		
		String resultado = "Conjunto Maguari";
		Endereco endereco = new Endereco();
		endereco.setLogradouro(resultado);
		assertEquals(resultado, endereco.getLogradouro());
	}

}

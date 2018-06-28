package br.com.exemplo;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.exemplo.model.Funcionario;
import br.com.exemplo.model.Projeto;
import br.com.exemplo.repository.IFuncionarioRepository;
import br.com.exemplo.repository.IProjetoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringManytomanyTests {

	@Autowired
	private IProjetoRepository iProjeto;
	
	@Autowired
	private IFuncionarioRepository iFuncionario;

	@Test
	public void verificaProjeto() {
		List<Projeto> lista = iProjeto.findAll();
		Assert.assertNotNull(lista);
		Assert.assertEquals("projeto-spring", lista.get(0).getNome());
		
	}

	@Test
	public void verificaFuncionario() {
		List<Funcionario> lista = iFuncionario.findAll();
		Assert.assertNotNull(lista);
		Assert.assertEquals("Joaquim dos Anjos", lista.get(0).getNome());
		Assert.assertEquals("Ana da Silva", lista.get(1).getNome());
	}
}

package br.com.exemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.exemplo.model.Funcionario;

public interface IFuncionarioRepository extends JpaRepository<Funcionario, Long> {

}

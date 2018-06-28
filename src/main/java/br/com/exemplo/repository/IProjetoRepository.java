package br.com.exemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.exemplo.model.Projeto;

public interface IProjetoRepository extends JpaRepository<Projeto, Long> {

}

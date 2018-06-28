package br.com.exemplo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Projeto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	@ManyToMany(mappedBy="projetos", cascade = CascadeType.ALL)
	private List<Funcionario> desenvolvedores;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Funcionario> getDesenvolvedores() {
		return desenvolvedores;
	}

	public void setDesenvolvedores(List<Funcionario> desenvolvedores) {
		this.desenvolvedores = desenvolvedores;
	}

}

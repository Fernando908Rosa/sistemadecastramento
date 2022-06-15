package com.fernandosilveira.Dto;

import javax.persistence.Column;

import com.fernandosilveira.entityes.Pessoa;

public class PessoaResponsePutDto {
	
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "datadenascimento")
	private String datadenascimento;
	
	@Column(name = "cpf")
	private Integer cpf;
	


	
	public PessoaResponsePutDto(Long id, String nome, String datadenascimento, Integer cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.datadenascimento = datadenascimento;
		this.cpf = cpf;
	}

	public static PessoaResponsePutDto converterParaPessoaResponseDto(Pessoa pessoa) {
		return new PessoaResponsePutDto(pessoa.getId(), pessoa.getNome(), pessoa.getDatadenascimento(), pessoa.getCpf() );
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDatadenascimento() {
		return datadenascimento;
	}

	public void setDatadenascimento(String datadenascimento) {
		this.datadenascimento = datadenascimento;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}


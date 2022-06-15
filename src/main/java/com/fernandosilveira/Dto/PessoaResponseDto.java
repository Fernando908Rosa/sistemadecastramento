package com.fernandosilveira.Dto;

import javax.persistence.Column;

import com.fernandosilveira.entityes.Pessoa;

public class PessoaResponseDto {
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "datadenascimento")
	private String datadenascimento;
	
	@Column(name = "cpf")
	private Integer cpf;

	public PessoaResponseDto(String nome, String datadenascimento, Integer cpf) {
		this.nome = nome;
		this.datadenascimento = datadenascimento;
		this.cpf = cpf;
	}
	
	public static PessoaResponseDto converterParaPessoaResponseDto(Pessoa pessoa) {
		return new PessoaResponseDto(pessoa.getNome(), pessoa.getDatadenascimento(), pessoa.getCpf());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
	
}


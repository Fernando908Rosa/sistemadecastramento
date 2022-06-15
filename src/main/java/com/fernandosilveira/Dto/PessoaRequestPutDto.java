package com.fernandosilveira.Dto;

import javax.persistence.Column;

import org.hibernate.validator.constraints.Length;

import com.fernandosilveira.entityes.Pessoa;

public class PessoaRequestPutDto {

	
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nome")
	@Length(min = 5, max = 70, message = "digite nome corretamente entre 5 a 70 caracteres")
	private String nome;
	
	@Column(name = "datadenascimento")
	private String datadenascimento;
	
	@Column(name = "cpf")
	private Integer cpf;
	
	public Pessoa converterParaEntidadePessoa() {
		return new Pessoa(id, nome, datadenascimento, cpf);
	}

	
	

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
	
	
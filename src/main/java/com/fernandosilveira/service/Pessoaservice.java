package com.fernandosilveira.service;

import java.io.Serializable;

public class Pessoaservice implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private Integer data;
	private Integer cpf;
	
	public Pessoaservice() {
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", name=" + name + ", data=" + data + ", cpf=" + cpf + "]";
	}


}

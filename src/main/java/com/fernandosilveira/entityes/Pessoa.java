package com.fernandosilveira.entityes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
	
	@Entity
	@Table(name = "tb_pessoa" )
	public class Pessoa {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		private String nome;
		private String datadenascimento;
		private Integer cpf;
		
		
		public Pessoa() {
		}

		

		public Pessoa(Long id, String nome, String datadenascimento, Integer cpf) {
			super();
			this.id = id;
			this.nome = nome;
			this.datadenascimento = datadenascimento;
			this.cpf = cpf;
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

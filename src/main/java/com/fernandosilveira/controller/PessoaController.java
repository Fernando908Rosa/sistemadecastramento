package com.fernandosilveira.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fernandosilveira.entityes.Pessoa;
import com.fernandosilveira.repository.PessoaRepository;
	
	@RequestMapping("/api")
	@RestController
	public class PessoaController {

		@Autowired
		private PessoaRepository pessoaRepository;
		
		
		//GET
	    @RequestMapping(value = "/pessoas", method = RequestMethod.GET, produces="application/json")
	    public List<Pessoa> GetPessoa(){
	    	return pessoaRepository.findAll();
	    }
	    
	    //POST
	    @RequestMapping(value = "/pessoa", method = RequestMethod.POST, produces="application/json")
	    public Pessoa PostPessoa(@RequestBody Pessoa pessoa) {
	    	return pessoaRepository.save(pessoa);
	    	
	    }
	    
	    //PUT
	    //DELETE
	    @RequestMapping(value = "/pessoa/{id}", method = RequestMethod.DELETE, produces="application/json")
	    public ResponseEntity<Object> DeletePessoa(@PathVariable(value="id") Long id){
	    	Optional<Pessoa> pessoa = pessoaRepository.findById(id); 
	    	if(pessoa.isPresent()) {
	    		pessoaRepository.delete(pessoa.get());
	    		return new ResponseEntity<>(HttpStatus.OK);
	    	}
	    	else {
	    		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    	}
	    }

}

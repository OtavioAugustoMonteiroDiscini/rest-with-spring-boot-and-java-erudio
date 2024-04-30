package br.com.erudio.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.model.Person;
import br.com.erudio.services.PersonServices;


@RestController
@RequestMapping("/person")
public class PersonController {
		
		@Autowired
		private PersonServices service ;

		
		@GetMapping(value = "/{id}", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
			public Person findById(@PathVariable(value = "id") Long id){
			return service.findById(id);
		}
		
		@DeleteMapping(value = "/{id}")
		public ResponseEntity<?> delete(@PathVariable(value = "id") Long id){
			service.delete(id);
			return ResponseEntity.noContent().build(); // Retornar Status Code 204
		}
		
		@PostMapping(produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE,
				consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
		public Person create(@RequestBody Person person){
			return service.create(person);
		}
		
		@PutMapping(produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE,
				consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
		public Person update(@RequestBody Person person){
			return service.update(person);
		}
		
		@GetMapping(produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
		public List<Person> findAll() {
		return service.findAll();
	}
		
		
}

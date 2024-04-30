package br.com.erudio.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.erudio.exception.ResourceNotFoundExcepetion;
import br.com.erudio.model.Person;
import br.com.erudio.repositories.PersonRepository;

@Service
public class PersonServices {


	private Logger logger = Logger.getLogger(PersonServices.class.getName());

	@Autowired
	PersonRepository repository;
	
	public List<Person> findAll() {
		
		logger.info("Finding all people!");
		
		return repository.findAll();
	}

	public Person findById(Long ID) {
		
		logger.info("Find one Person!");
	
		return repository.findById(ID)
				.orElseThrow(() -> new ResourceNotFoundExcepetion("No Records found for this ID"));
	}
	
	public Person create(Person person) {
		
		logger.info("Create a new Person!");
		return repository.save(person);
		
	}
	public void delete(Long ID) {
		
		logger.info("Delete one Person!");
		
		var entity = repository.findById(ID)
				.orElseThrow(() -> new ResourceNotFoundExcepetion("No Records found for this ID"));
		repository.delete(entity);
		
	}
	public Person update(Person person) {
		
		logger.info("Updating a Person!");
		var entity = repository.findById(person.getId())
				.orElseThrow(() -> new ResourceNotFoundExcepetion("No Records found for this ID"));
	
		
		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setAddress(person.getAddress());
		entity.setGender(person.getGender());
		return repository.save(person);
		
	}
	
	
}

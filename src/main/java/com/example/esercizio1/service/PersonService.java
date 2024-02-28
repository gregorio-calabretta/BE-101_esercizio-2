package com.example.esercizio1.service;

import com.example.esercizio1.repository.PersonRepository;
import com.example.esercizio1.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {
    private final PersonRepository personRepository;
    @Autowired
    public PersonService( PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public int addPerson(Person person){
        return personRepository.insertPerson(person);
    }
    public List<Person> getAllPeople(){
        return personRepository.selectAllPeople();
    }

    public Optional<Person> getPersonById(UUID id){
        return personRepository.selectPersonById(id);
    }
    public int deletePerson(UUID id){
        return personRepository.deletePersonById(id);
    }
    public int updatePerson(UUID id,Person newPerson){
        return personRepository.updatePersonById(id,newPerson);
    }
}

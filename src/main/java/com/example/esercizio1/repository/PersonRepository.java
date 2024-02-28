package com.example.esercizio1.repository;

import com.example.esercizio1.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PersonRepository extends JpaRepository<Person,UUID> {
        int insertPerson(UUID id,Person person);
        default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id,person);
    }
    List<Person> selectAllPeople();
    int deletePersonById(UUID id);
    int updatePersonById(UUID id,Person person);
    Optional<Person> selectPersonById(UUID id);
}

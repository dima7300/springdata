package ru.dimitr.springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dimitr.springdata.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}

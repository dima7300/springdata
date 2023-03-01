package ru.dimitr.springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.dimitr.springdata.entity.Person;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Integer> {
   List<Person> findByFirstName(String firstName);

   @Query("select p from Person p order by firstName")//проблема на видео 29:02
   List<Person> findAllOrderByFirstName();

}

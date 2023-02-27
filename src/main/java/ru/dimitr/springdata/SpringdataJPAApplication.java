package ru.dimitr.springdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.dimitr.springdata.entity.Person;
import ru.dimitr.springdata.jdbc.PersonJdbcDao;
import ru.dimitr.springdata.repository.PersonRepository;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringdataJPAApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringdataJPAApplication.class, args);
	}
	@Autowired
	PersonRepository personRepository;



	@Override
	public void run(String... args) throws Exception {

		Person anna = new Person("Anna","Andreeva", "Samara");
		Person olesya = new Person("Olesya","Andreeva", "Moskow");
		Person alex = new Person("Alex","Andreev", "Omsk");

		List<Person> people = Arrays.asList(anna,olesya,alex);

		personRepository.saveAll(people);


		System.out.println("<<<<<<" + personRepository.findAll());
	}
}

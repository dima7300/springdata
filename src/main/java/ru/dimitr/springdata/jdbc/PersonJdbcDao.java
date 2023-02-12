package ru.dimitr.springdata.jdbc;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.dimitr.springdata.entity.Person;

import java.util.List;

@Repository
public class PersonJdbcDao {

    final JdbcTemplate jdbcTemplate;

    public PersonJdbcDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Person> findAll() {
        List<Person> people = jdbcTemplate.query("select * from person",
                new BeanPropertyRowMapper<>(Person.class));
        return people;
    }

    public int insert(Person person) {
        return jdbcTemplate.update("insert into person" +
                        "(id, firstName, lastName, adress)" +
                        "values (?,?,?,?)",
                new Object[]{
                        person.getId(), person.getFirstName(),
                        person.getLastName(), person.getAdress()
                });
    }

}

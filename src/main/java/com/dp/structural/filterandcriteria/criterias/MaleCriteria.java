package com.dp.structural.filterandcriteria.criterias;

import com.dp.structural.filterandcriteria.Gender;
import com.dp.structural.filterandcriteria.Person;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MaleCriteria implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        Predicate<Person> predicate = person -> person.getGender().equals(Gender.MALE);
        return persons.stream().filter(predicate).collect(Collectors.toList());
    }
}

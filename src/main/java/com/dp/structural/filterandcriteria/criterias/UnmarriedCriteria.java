package com.dp.structural.filterandcriteria.criterias;

import com.dp.structural.filterandcriteria.MarriedStatus;
import com.dp.structural.filterandcriteria.Person;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UnmarriedCriteria implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        Predicate<Person> predicate = person -> person.getMarriedStatus().equals(MarriedStatus.UNMARRIED);
        return persons.stream().filter(predicate).collect(Collectors.toList());
    }
}

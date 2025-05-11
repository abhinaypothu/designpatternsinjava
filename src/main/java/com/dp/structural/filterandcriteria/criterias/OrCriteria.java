package com.dp.structural.filterandcriteria.criterias;

import com.dp.structural.filterandcriteria.Person;

import java.util.List;

public class OrCriteria implements Criteria{

    Criteria firstCriteria;
    Criteria secondCriteria;
    OrCriteria(Criteria firstCriteria, Criteria secondCriteria)
    {
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = firstCriteria.meetCriteria(persons);
        List<Person> secondCriteriaPersons = secondCriteria.meetCriteria(persons);
        for(Person person: secondCriteriaPersons)
            if(!firstCriteriaPersons.contains(person))firstCriteriaPersons.add(person);
        return firstCriteriaPersons;
    }
}

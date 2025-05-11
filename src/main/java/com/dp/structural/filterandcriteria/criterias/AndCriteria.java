package com.dp.structural.filterandcriteria.criterias;

import com.dp.structural.filterandcriteria.Person;

import java.util.List;

public class AndCriteria implements Criteria{
    Criteria firstCriteria;
    Criteria secondCriteria;
    public AndCriteria(Criteria firstCriteria, Criteria secondCriteria)
    {
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return secondCriteria.meetCriteria(firstCriteria.meetCriteria(persons));
    }
}

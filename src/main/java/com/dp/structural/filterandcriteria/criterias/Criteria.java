package com.dp.structural.filterandcriteria.criterias;

import com.dp.structural.filterandcriteria.Person;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}

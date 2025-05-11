package com.dp.structural.filterandcriteria;

import com.dp.structural.filterandcriteria.criterias.*;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("abhi",Gender.MALE,MarriedStatus.UNMARRIED));
        persons.add(new Person("ammu",Gender.FEMALE,MarriedStatus.MARRIED));
        persons.add(new Person("anand",Gender.MALE,MarriedStatus.MARRIED));
        persons.add(new Person("anushka",Gender.FEMALE,MarriedStatus.UNMARRIED));

        System.out.println("All persons");
        System.out.println(persons);

        MaleCriteria maleCriteria = new MaleCriteria();
        List<Person> malePersons = maleCriteria.meetCriteria(persons);
        System.out.println("Male persons");
        System.out.println(malePersons);

        FemaleCriteria femaleCriteria = new FemaleCriteria();
        List<Person> femalePersons = femaleCriteria.meetCriteria(persons);
        System.out.println("Female persons");
        System.out.println(femalePersons);

        MarriedCriteria marriedCriteria = new MarriedCriteria();
        List<Person> marriedPersons = marriedCriteria.meetCriteria(persons);
        System.out.println("Married persons");
        System.out.println(marriedPersons);

        UnmarriedCriteria unmarried = new UnmarriedCriteria();
        List<Person> unmarriedPersons = unmarried.meetCriteria(persons);
        System.out.println("Unmarried persons");
        System.out.println(unmarriedPersons);

        System.out.println("---------------------------------------");

        AndCriteria andCriteria = new AndCriteria(maleCriteria,marriedCriteria);
        List<Person> andPersons = andCriteria.meetCriteria(persons);
        System.out.println("male and married persons");
        System.out.println(andPersons);

        System.out.println("---------------------------------------");
        AndCriteria andCriteria2 = new AndCriteria(maleCriteria,unmarried);
        List<Person> andPersons2 = andCriteria2.meetCriteria(persons);
        System.out.println("male and unmarried persons");
        System.out.println(andPersons2);


        System.out.println("---------------------------------------");

        AndCriteria andCriteria4 = new AndCriteria(femaleCriteria,marriedCriteria);
        List<Person> andPersons4 = andCriteria4.meetCriteria(persons);
        System.out.println("female and married persons");
        System.out.println(andPersons4);

        System.out.println("---------------------------------------");
        AndCriteria andCriteria3 = new AndCriteria(femaleCriteria,unmarried);
        List<Person> andPersons3 = andCriteria3.meetCriteria(persons);
        System.out.println("female and unmarried persons");
        System.out.println(andPersons3);


    }
}

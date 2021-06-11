package ru.my.test.dao;

import org.springframework.stereotype.Component;
import ru.my.test.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;
    private List<Person> peopleFilter;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Tom", 0));
        people.add(new Person(++PEOPLE_COUNT, "Bob", 200));
        people.add(new Person(++PEOPLE_COUNT, "Mike", 300));
        people.add(new Person(++PEOPLE_COUNT, "Katy", 400));

    }

    public List<Person> index(){
        return people;
    }

    public List<Person> indexFilter(String debt) {
        if (debt != null) {
            peopleFilter = new ArrayList<>(people);
            for (Person person : peopleFilter) {
                if (person.getDebt() == 0)
                    peopleFilter.remove(person);
                return peopleFilter;
            }
        }
        return people;
        }



    public Person show(int id){
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person){
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, Person updatedPerson) {
        Person personToBeUpdated = show(id);
        personToBeUpdated.setDebt(updatedPerson.getDebt());
    }
}

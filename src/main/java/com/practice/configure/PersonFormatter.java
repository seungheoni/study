package com.practice.configure;

import com.practice.dto.Person;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class PersonFormatter implements Formatter<Person> {

    @Override
    public Person parse(String text, Locale locale) throws ParseException {

        Person person = new Person();
        person.setAge(Integer.parseInt(text));
        return person;
    }

    @Override
    public String print(Person object, Locale locale) {
        return object.toString();
    }
}

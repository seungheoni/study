package com.practice.springpra;

import com.practice.testcls.Person;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.IntConsumer;

import static org.junit.jupiter.api.Assertions.*;

public class LamdaAndOptionalStudy {


    @Test
    void lamda() {

        /*
                lambda
                ()  파라미터
                -> (return 할 로직)
         */
        IntConsumer printInt = (base) -> System.out.println(base);
        printInt.accept(3);

    }

    @Test
    void optional() {

        Person person = new Person();

        Optional<String> name = person.getName();

        assertThrows(NoSuchElementException.class, name::get);

    }

}
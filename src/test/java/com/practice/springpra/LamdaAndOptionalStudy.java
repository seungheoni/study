package com.practice.springpra;

import com.practice.testcls.Person;
import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class LamdaAndOptionalStudy {


    @Test
    void lamda() {

        /*
                lambda
                ()  파라미터
                -> (return 할 로직)

        람다는 쉐도잉이 일어나지 않고 (같은 지역으로 취급한다)
        따라서 외부와 동일한 이름의 변수를 사용 할 수 없다.

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

    @Test
    void optionalApi() {

        Person person = new Person();
        //person.setName("seongheon");

        Optional<Person> oc = Optional.ofNullable(person);

        // 값이 있으면 작동하는 ifPresent
        oc.ifPresent((obj) -> System.out.println(obj.getName()));

        //값이 null일 경우 어떤 값으로 대체해서 리턴을 해줘야하는지.
        oc.orElse(resPrint());

        //값이 null일 경우 어떤 값으로 대체해서 리턴을 해줘야하는지.
        oc.orElse(resPrint());


    }
    public Person resPrint() {
        return new Person();
    }


    @Test
    public void streamForEach() {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(9);
        list.add(4);
        list.add(0);
        list.add(5);
        list.add(1);

        Stream<Integer> stream = list.stream();

        stream.forEach(System.out::println);
    }

    @Test
    public void streamForEach2() {
        String[] arr = new String[]{"넷","둘","하나","셋"};

        // 1에서 시작에서 3까지 stream
        Stream<String> stream2 = Arrays.stream(arr, 1, 3);

        stream2.forEach(e -> System.out.print(e + " "));
    }

    @Test
    public void streamMap() {
        List<String> names = new ArrayList<String>();
        names.add("seongheon");
        names.add("jimin");
        names.add("hyucheol");
        names.add("fedalong");

        Stream<String> stream = names.stream().map(String::toUpperCase);
        stream.forEach(System.out::println);

    }

    @Test
    public void streamCollect() {
        List<String> names = new ArrayList<String>();
        names.add("seongheon");
        names.add("jimin");
        names.add("hyucheol");
        names.add("fedalong");


        ArrayList upperCaseList = (ArrayList) names.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(upperCaseList);
    }
}
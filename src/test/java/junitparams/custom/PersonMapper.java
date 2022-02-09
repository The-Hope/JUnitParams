package junitparams.custom;

import com.alibaba.fastjson.JSON;
import com.google.common.io.CharStreams;
import junitparams.mappers.DataMapper;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import static junitparams.usage.person_example.PersonTest.Person;

public class PersonMapper implements DataMapper {
    @Override
    public Person[] map(Reader reader) {
        List<Person> personList = new ArrayList<Person>();
        try {
            String content = CharStreams.toString(reader);
            Person person = JSON.parseObject(content, Person.class);
            personList.add(person);
        } catch (IOException ignore) {
        }

        return personList.toArray(new Person[0]);
    }

}
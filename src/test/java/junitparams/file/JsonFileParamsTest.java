package junitparams.file;

import junitparams.JUnitParamsRunner;
import junitparams.custom.JsonParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.usage.person_example.PersonTest.Person;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Json format file params test
 *
 * @author Sivan
 * @since 2021/8/18 11:41 下午
 */
@RunWith(JUnitParamsRunner.class)
public class JsonFileParamsTest {
    @Test
    @JsonParameters(value = "src/test/resources/json_test.json", clazz = Person.class)
    public void loadJsonParamsFromFileWithCustomMapper(Person person) {
        assertThat(person.getAge()).isGreaterThan(0);
    }
}

package junitparams.custom;

import junitparams.custom.mappers.JsonMapper;
import org.junit.runners.model.FrameworkMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Description: </br>
 *
 * @author 王熙
 * @version 1.0
 * @since 2022/2/8 3:36 PM
 */
public class JsonParameterProvider implements ParametersProvider<JsonParameters> {
    private JsonParameters jsonParameters;

    @Override
    public void initialize(JsonParameters parametersAnnotation, FrameworkMethod frameworkMethod) {
        this.jsonParameters = parametersAnnotation;
    }

    @Override
    public Object[] getParameters() {
        try {
            Reader reader = createProperReader();
            JsonMapper jsonMapper = new JsonMapper();
            try {
                return jsonMapper.map(reader, jsonParameters.clazz());
            } finally {
                reader.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(
                    "Could not successfully read parameters from file: " + jsonParameters.value(), e);
        }
    }

    private Reader createProperReader() throws IOException {
        String filepath = jsonParameters.value();
        String encoding = jsonParameters.encoding();

        if (filepath.indexOf(':') < 0) {
            return new InputStreamReader(new FileInputStream(filepath), encoding);
        }

        String protocol = filepath.substring(0, filepath.indexOf(':'));
        String filename = filepath.substring(filepath.indexOf(':') + 1);

        if ("classpath".equals(protocol)) {
            return new InputStreamReader(getClass().getClassLoader().getResourceAsStream(filename), encoding);
        } else if ("file".equals(protocol)) {
            return new InputStreamReader(new FileInputStream(filename), encoding);
        }

        throw new IllegalArgumentException("Unknown file access protocol. Only 'file' and 'classpath' are supported!");
    }
}

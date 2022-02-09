package junitparams.custom.mappers;

import com.alibaba.fastjson.JSON;
import com.google.common.io.CharStreams;

import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * json 转换器
 */
public class JsonMapper {

    public <T> T[] map(Reader reader, Class<T> clazz) {
        List<T> resultList = new ArrayList<T>();
        try {
            String content = CharStreams.toString(reader);
            T data = JSON.parseObject(content, clazz);
            resultList.add(data);
        } catch (IOException ignore) {
        }

        return resultList.toArray((T[]) Array.newInstance(clazz, 0));
    }
}
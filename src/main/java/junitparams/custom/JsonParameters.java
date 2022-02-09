package junitparams.custom;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description: </br>
 * Json parameters 注解，支持 json 文件的解析
 *
 * @author 王熙
 * @version 1.0
 * @since 2022/2/8 3:37 PM
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@CustomParameters(provider = JsonParameterProvider.class)
public @interface JsonParameters {

    /**
     * json File name (with full path) of the file with data.
     */
    String value();

    /**
     * 待序列化的目标类型泛型
     *
     * @return 待序列化的目标类型泛型
     */
    Class<?> clazz();

    /**
     * Encoding to use when reading file contents.
     */
    String encoding() default "UTF-8";

}

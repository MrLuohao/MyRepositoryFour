package note;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

@Repeatable(value = MyTypes.class)
@Target(ElementType.TYPE_USE)
//不兼容的类型。发现:‘. lang。String'， required: 'java.lang.Class<?扩展java.lang.annotation.Annotation >”
public @interface MyType {
    String value() default "";

}

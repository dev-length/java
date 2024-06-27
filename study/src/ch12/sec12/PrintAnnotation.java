package ch12.sec12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) //해당 어노테이션을 메소드에 적용하겠다 (@Target : 적용 대상 설정)
@Retention(RetentionPolicy.RUNTIME) // 해당 어노테이션을 런타임까지 유지하겠다 (@Retention : 유지 정책 설정)
public @interface PrintAnnotation {
    String value() default "-";
    int number() default 15;
}

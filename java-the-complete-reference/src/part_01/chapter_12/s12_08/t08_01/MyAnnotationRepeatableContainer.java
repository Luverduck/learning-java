package part_01.chapter_12.s12_08.t08_01;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 중복 적용을 허용 할 어노테이션의 컨테이너 어노테이션
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotationRepeatableContainer {
    MyAnnotationRepeatable[] value();
}

package part_01.chapter_12.s12_08.t08_01;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 중복 적용을 허용 할 어노테이션
@Repeatable(MyAnnotationRepeatableContainer.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotationRepeatable {
    int iMember();
    String sMember();
}

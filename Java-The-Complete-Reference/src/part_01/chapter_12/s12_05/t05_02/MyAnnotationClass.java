package part_01.chapter_12.s12_05.t05_02;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
public @interface MyAnnotationClass {

    String sElement();

}

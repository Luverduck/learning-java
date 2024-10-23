package part_01.chapter_12.s12_05.t05_03;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotationRuntime {

    String sElement();

}

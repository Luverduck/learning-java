package part_01.chapter_12.s12_05.t05_01;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface MyAnnotationSource {

    String sElement();

}

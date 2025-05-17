package part_01.chapter_12.s12_06.t06_05;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
public @interface MaxLen {
    int value();
}

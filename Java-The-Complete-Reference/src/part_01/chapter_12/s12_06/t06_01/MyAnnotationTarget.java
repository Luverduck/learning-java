package part_01.chapter_12.s12_06.t06_01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// @Target에 ElementType 배열의 초기화 리스트 전달
@Target( {ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR} )
public @interface MyAnnotationTarget {
}

package part_01.chapter_12.s12_07.t07_01;

import java.lang.annotation.Annotation;

public class AnnotationInherited {
    public static void main(String[] args) {

        // MyClassInherited에 적용된 모든 어노테이션 반환
        Annotation[] annotations = MyClassInherited.class.getAnnotations();
        for(var annotation : annotations)
            System.out.println(annotation);

    }
}

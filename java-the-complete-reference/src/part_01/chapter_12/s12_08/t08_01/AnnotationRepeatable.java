package part_01.chapter_12.s12_08.t08_01;

import java.lang.annotation.Annotation;

public class AnnotationRepeatable {
    public static void main(String[] args) {

        // MyClassRepeatable에 적용된 모든 어노테이션 반환
        Annotation[] annotations = MyClassRepeatable.class.getAnnotations();
        for(Annotation annotation : annotations) {
            // 어노테이션의 타입이 MyAnnotationRepeatableContainer일 경우에만 실행
            if(annotation instanceof MyAnnotationRepeatableContainer) {
                // 어노테이션 타입을 MyAnnotationRepeatableContainer로 형 변환
                MyAnnotationRepeatableContainer container = (MyAnnotationRepeatableContainer)annotation;
                // MyAnnotationRepeatableContainer의 요소 출력
                for(MyAnnotationRepeatable repeatable : container.value())
                    System.out.println(repeatable + " [iMember = %d, sMember = %s]".formatted(repeatable.iMember(), repeatable.sMember()));
            }
        }

    }
}

package part_01.chapter_12.s12_05.t05_02;

public class MyAnnotationClassAccess {
    public static void main(String[] args) {

        // 런타임에 MyClassClass의 어노테이션 MyAnnotationClass에 접근
        MyAnnotationClass mac = MyClassClass.class.getAnnotation(MyAnnotationClass.class);
        System.out.println("Annotation : " + mac);

    }
}

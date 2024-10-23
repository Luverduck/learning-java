package part_01.chapter_12.s12_05.t05_03;

public class MyAnnotationRuntimeAccess {
    public static void main(String[] args) {

        // 런타임에 MyClassRuntime의 어노테이션 MyAnnotationRuntime에 접근
        MyAnnotationRuntime mar = MyClassRuntime.class.getAnnotation(MyAnnotationRuntime.class);
        System.out.println("Annotation : " + mar);

    }
}

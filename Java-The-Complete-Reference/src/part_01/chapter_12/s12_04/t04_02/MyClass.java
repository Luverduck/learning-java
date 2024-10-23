package part_01.chapter_12.s12_04.t04_02;

@MyAnnotationClass(iMemberClass = 1, sMemberClass = "Annotation of Class") // 클래스의 어노테이션
public class MyClass {

    // 필드 (Field)
    @MyAnnotationField(iMemberField = 2, sMemberField = "Annotation of Field") // 필드의 어노테이션
    String sField = "MyClass의 필드";
    
    // 메소드 (Method)
    @MyAnnotationMethod(iMemberMethod = 3, sMemberMethod = "Annotation of Method") // 메소드의 어노테이션
    void vMethod(
            @MyAnnotationParameter(iMemberParameter = 4, sMemberParameter = "Annotation of Parameter") // 매개변수의 어노테이션
            int iParam
    ) {
        System.out.println("MyClass의 메소드");
    }

}

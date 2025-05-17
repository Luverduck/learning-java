package part_01.chapter_12.s12_01.t01_01;

public enum MyEnum {

    // 열거 상수 (Enumeration Constant)
    ENUM_CONST1,
    ENUM_CONST2,
    ENUM_CONST3;

    // 필드 (Field)
    String sFieldEnum = "MyEnum의 필드 접근";

    // 메소드 (Method)
    void vMethodEnum() {
        System.out.println("MyEnum의 메소드 호출");
    }

    // 생성자 (Constructor)
    MyEnum() {
        System.out.println("MyEnum의 생성자 호출");
    }

}

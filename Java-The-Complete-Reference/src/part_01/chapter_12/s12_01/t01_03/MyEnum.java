package part_01.chapter_12.s12_01.t01_03;

public enum MyEnum {

    // 열거 상수 (Enumeration Constant)
    ENUM_CONST1("Enum1"),
    ENUM_CONST2("Enum2"),
    ENUM_CONST3("Enum3");

    // 생성자 (Constructor)
    MyEnum() {
        System.out.println("MyEnum의 기본 생성자 호출");
    }
    MyEnum(String sParam) {
        System.out.println("MyEnum의 매개변수가 있는 생성자 호출");
    }

}

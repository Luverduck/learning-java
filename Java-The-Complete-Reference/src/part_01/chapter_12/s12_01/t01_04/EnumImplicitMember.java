package part_01.chapter_12.s12_01.t01_04;

public class EnumImplicitMember {
    public static void main(String[] args) {

        MyEnum en0 = MyEnum.ENUM_CONST1;
        MyEnum en1 = MyEnum.ENUM_CONST1;
        MyEnum en2 = MyEnum.ENUM_CONST2;
        MyEnum en3 = MyEnum.ENUM_CONST3;

        // 열거 상수의 이름을 반환
        String e1Name = en1.name();

        // 열거 상수의 순서를 반환
        int e1Ordinal = en1.ordinal();

        // 열거 상수와 target의 동등 여부 반환
        boolean equals01 = en0.equals(en1);
        boolean equals12 = en1.equals(en2);
        boolean equal01 = en0 == en1;
        boolean equal12 = en1 == en2;

        // 열거 상수와 target의 순번 차이 반환
        int diff13 = en1.compareTo(en3);
        int diff31 = en3.compareTo(en1);

        // 열거 클래스에서 문자열에 해당하는 이름의 열거 상수 반환
        MyEnum enS = MyEnum.valueOf("ENUM_CONST1");

        // 열거 클래스의 모든 열거 상수를 해당 열거형 배열로 반환
        MyEnum[] enArr = MyEnum.values();

    }
}

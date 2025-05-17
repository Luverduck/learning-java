package part_01.chapter_14.s14_13.t13_02;

public class MyClassGeneric<T> {

    // 정적 필드 선언 불가능
    //static T fieldStatic;

    // 정적 메소드 선언 불가능
    /*static T methodStatic() {
        return this.field;
    }*/

    // 정적 제네릭 메소드 선언 가능
    static <T> T methodGenericStatic(T param) {
        return param;
    }

}

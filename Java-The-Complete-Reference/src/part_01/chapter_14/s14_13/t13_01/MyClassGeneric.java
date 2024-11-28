package part_01.chapter_14.s14_13.t13_01;

public class MyClassGeneric<T> {

    T field;

    MyClassGeneric() {
        // 타입 매개변수 타입의 객체 생성 불가능
        //field = new T();
    }

}

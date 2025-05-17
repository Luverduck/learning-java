package part_01.chapter_14.s14_13.t13_03;

public class MyClassGeneric<T> {

    T[] fieldArr;

    MyClassGeneric() {
        // 타입 매개변수 타입의 배열 생성 불가능
        //fieldArr = new T[10];
    }

}

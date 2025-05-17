package part_01.chapter_14.s14_11.t11_01;

public class MyClassGeneric<T> {

    T method(T param) {
        System.out.println("T param = " + param);
        return param;
    }

}

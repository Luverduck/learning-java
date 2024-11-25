package part_01.chapter_14.S14_10.t10_01;

public class MyClassGeneric<T> {

    T method(T param) {
        System.out.println("T param = " + param);
        return param;
    }

}

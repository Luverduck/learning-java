package part_01.chapter_14.s14_11.t11_01;

public class MyClassGeneric<T> {

    T field;

    T method() {
        return this.field;
    }

    MyClassGeneric(T t) {
        this.field = t;
    }

}

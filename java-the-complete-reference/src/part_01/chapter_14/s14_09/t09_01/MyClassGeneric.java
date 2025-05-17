package part_01.chapter_14.s14_09.t09_01;

public class MyClassGeneric<T> {

    T field;

    T method() {
        return this.field;
    }

    MyClassGeneric(T t) {
        this.field = t;
    }

}

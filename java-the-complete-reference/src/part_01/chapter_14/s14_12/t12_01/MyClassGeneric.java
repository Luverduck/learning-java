package part_01.chapter_14.s14_12.t12_01;

public class MyClassGeneric<T, U> {

    T fieldT;
    U fieldU;

    void method(T paramT) {
        this.fieldT = paramT;
    }
    /*void method(U paramU) {
        this.fieldU = paramU;
    }*/

}

package part_01.chapter_14.s14_03.t03_01;

public class BoundedType {
    public static void main(String[] args) {

        // Number 및 그 하위 클래스만 타입 매개변수에 전달할 수 있다.
        MyClassGeneric<Number> mgNumber;
        MyClassGeneric<Integer> mgInteger;

        // Number보다 상위 클래스는 타입 매개변수에 전달할 수 있다.
        //MyClassGeneric<Object> mgString;

    }
}

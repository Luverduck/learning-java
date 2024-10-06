package part_01.chapter_08.s08_03.t03_02;

public class ConstructorCall {
    public static void main(String[] args) {

        // MyClassSub의 인스턴스 생성
        MyClassSub mSub = new MyClassSub();
        System.out.println("----------------------");

        // MyClass의 인스턴스 생성
        MyClass m = new MyClass();
        System.out.println("----------------------");

        // MyClassSuper의 인스턴스 생성
        MyClassSuper mSuper = new MyClassSuper();

    }
}
package part_01.chapter_08.s08_05.t05_02;

public class MethodDynamicDispatch {
    public static void main(String[] args) {

        // 메소드 동적 디스패치 (Method Dynamic Dispatch)
        MyClass m = new MyClass();
        m.methodSuper();

        MyClassSuper ms = new MyClass();
        ms.methodSuper();

        MyClassSuper mSuper = new MyClassSuper();
        mSuper.methodSuper();

    }
}

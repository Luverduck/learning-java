package part_01.chapter_08.s08_05.t05_01;

public class MethodStaticDispatch {
    public static void main(String[] args) {

        // 메소드 정적 디스패치 (Method Static Dispatch)
        MyClass m = new MyClass();
        m.method();
        m.method("Hello!");

    }
}

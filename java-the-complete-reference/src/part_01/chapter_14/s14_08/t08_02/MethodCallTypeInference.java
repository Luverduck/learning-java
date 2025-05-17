package part_01.chapter_14.s14_08.t08_02;

public class MethodCallTypeInference {
    public static void main(String[] args) {

        vMethod( new MyClassGeneric<>() );

    }

    static void vMethod(MyClassGeneric<Integer, String> gParam) {
        // ...
    }
}

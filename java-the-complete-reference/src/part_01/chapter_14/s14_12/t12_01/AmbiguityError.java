package part_01.chapter_14.s14_12.t12_01;

public class AmbiguityError {
    public static void main(String[] args) {

        MyClassGeneric<String, String> mc = new MyClassGeneric<>();

        mc.method("Hello, World!");

    }
}

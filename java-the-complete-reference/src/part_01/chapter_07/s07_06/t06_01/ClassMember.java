package part_01.chapter_07.s07_06.t06_01;

public class ClassMember {
    public static void main(String[] args) {

        MyClass m1 = new MyClass(1);
        System.out.println("m1.iField : %d".formatted(m1.iFieldStatic));
        System.out.println("m1.iFieldStatic : %d".formatted(m1.iFieldStatic));
        m1.methodStatic();

        MyClass m2 = new MyClass(2);
        System.out.println("m2.iField : %d".formatted(m2.iFieldStatic));
        System.out.println("m2.iFieldStatic : %d".formatted(m2.iFieldStatic));
        m2.methodStatic();

    }
}

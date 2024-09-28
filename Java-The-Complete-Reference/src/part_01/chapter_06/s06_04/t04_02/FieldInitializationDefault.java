package part_01.chapter_06.s06_04.t04_02;

public class FieldInitializationDefault {
    public static void main(String[] args) {

        // 클래스의 인스턴스 생성
        MyClass m = new MyClass();
        System.out.println("iField : %d".formatted(m.iField));
        System.out.println("fField : %f".formatted(m.fField));
        System.out.println("bField : %b".formatted(m.bField));
        System.out.println("cField : %c".formatted(m.cField));
        System.out.println("sField : %s".formatted(m.sField));

    }
}

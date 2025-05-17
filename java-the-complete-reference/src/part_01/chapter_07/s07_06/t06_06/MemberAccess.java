package part_01.chapter_07.s07_06.t06_06;

public class MemberAccess {
    public static void main(String[] args) {

        // 클래스를 통한 멤버의 접근
        // 클래스 멤버의 접근
        int fieldStatic = MyClass.iFieldStatic;
        MyClass.methodStatic();

        // 클래스의 인스턴스를 통한 멤버의 접근
        MyClass m = new MyClass();
        // 인스턴스 멤버의 접근
        int field = m.iField;
        m.method();
        // 클래스 멤버의 접근
        int fieldStatic_ = m.iFieldStatic;
        m.methodStatic();

    }

}

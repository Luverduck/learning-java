package part_01.chapter_06.s06_02.t02_04;

public class MemberAccess {
    public static void main(String[] args) {

        // 인스턴스 생성
        MyClass m = new MyClass();

        // 인스턴스의 멤버 접근
        System.out.println(m.field);
        m.method();
        
    }
}

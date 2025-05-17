package part_01.chapter_07.s07_05.t05_01;

public class MyClassOutside {

    // 클래스 스코프 밖에서 클래스의 멤버 접근
    public static void main(String[] args) {

        // 클래스의 인스턴스 생성
        MyClass m = new MyClass();

        // 기본 접근 제한 멤버 접근
        int iField = m.iField;
        m.method();

        // public 멤버 접근
        int iFieldPublic = m.iField;
        m.methodPublic();

        // private 멤버 접근
        // int iFieldPrivate = m.iFieldPrivate;
        // m.methodPrivate();

    }
    
}

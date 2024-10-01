package part_01.chapter_07.s07_05.t05_01;

public class MyClass {

    // 필드 (Field)
    int iField;
    public int iFieldPublic;
    private int iFieldPrivate;

    // 메소드 (Method)
    void method() {
        System.out.println("메소드 호출");
    }
    public void methodPublic() {
        System.out.println("public 메소드 호출");
    }
    private void methodPrivate() {
        System.out.println("private 메소드 호출");
    }

    // 클래스 스코프 안에서 클래스의 멤버 접근
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
        int iFieldPrivate = m.iFieldPrivate;
        m.methodPrivate();

    }
}

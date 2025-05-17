package part_01.chapter_07.s07_08.t08_03;

public class MyClass {

    // 인스턴스 멤버 (Instance Member)
    private String sField = "외부 클래스의 필드";
    public void method() {
        System.out.println("외부 클래스의 메소드 호출");
    }

    // 클래스 멤버 (Class Member)
    private static String sFieldStatic = "외부 클래스의 정적 필드";
    public static void methodStatic() {
        System.out.println("외부 클래스의 정적 메소드 호출");
    }

    // 정적 중첩 클래스 (Static Nested Class)
    static class StaticNestedClass {
        private String sFieldStaticNested = "정적 중첩 클래스의 필드";
        public void methodStaticNested() {
            System.out.println("정적 중첩 클래스의 메소드 호출");
            // 정적 중첩 클래스에서 외부 클래스의 인스턴스 멤버 접근
            // 정적 멤버는 인스턴스 멤버에 접근할 수 없다.
            /*System.out.println("%s 접근".formatted(sField));
            method();*/
            // 정적 중첩 클래스에서 외부 클래스의 클래스 멤버 접근
            System.out.println("%s 접근".formatted(sFieldStatic));
            methodStatic();
        }
    }

}

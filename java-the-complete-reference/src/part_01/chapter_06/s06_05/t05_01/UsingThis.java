package part_01.chapter_06.s06_05.t05_01;

public class UsingThis {
    public static void main(String[] args) {

        // 클래스의 인스턴스 생성
        MyClass m = new MyClass(1, 1.5, true, 'a', "AAA");

        // 메소드 호출
        m.method(2, 2.5, false, 'b', "BBB");

    }
}

package part_01.chapter_07.s07_04.t04_02;

public class StackOverflow {
    public static void main(String[] args) {

        // 클래스의 인스턴스 생성
        MyClass m = new MyClass();

        // 종료 조건이 없는 메소드의 재귀 호출
        m.methodRecursive(3);

    }
}

package part_01.chapter_07.s07_02.t02_01;

public class CallByValue {
    public static void main(String[] args) {

        // 클래스의 인스턴스 생성
        MyClass m = new MyClass();

        // 값에 의한 호출 (Call By Value)
        int x = 10;
        m.method(x);

    }
}

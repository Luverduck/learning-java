package part_01.chapter_07.s07_02.t02_02;

public class CallByReference {
    public static void main(String[] args) {

        // 클래스의 인스턴스 생성
        MyClass m = new MyClass();

        // 참조에 의한 호출 (Call By Reference)
        int[] arr = new int[] {10, 20, 30};
        m.method(arr);

    }
}

package part_01.chapter_07.s07_04.t04_02;

public class MyClass {

    // 종료 조건이 없는 메소드의 재귀 호출
    void methodRecursive(int x) {
        System.out.println("[호출] method(int x) [x = %d]".formatted(x));
        /*if(x <= 0)
        {
            System.out.println("[종료] method(int x) [x = %d]".formatted(x));
            return;
        }*/
        methodRecursive(x - 1);
        System.out.println("[종료] method(int x) [x = %d]".formatted(x));
    }

}

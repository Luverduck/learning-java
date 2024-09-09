package s06_03;

/**
 * 가변 인수 (Variadic Argument)
 * 메소드를 호출할 때 전달되는 인수의 개수가 고정되지 않은 인수
 * 메소드의 선언부에서 가변 인수를 전달받을 매개변수의 자료형 뒤에 `…`을 붙여 선언한다.
 */

public class L03_01 {
    public static void main(String[] args) {
        // 인수를 1개 전달하여 함수 실행
        func(1);
        // 인수를 2개 전달하여 함수 실행
        func(1, 2);
        // 인수를 3개 전달하여 함수 실행
        func(1, 2, 3);
    }
    // 가변 인수를 전달받아 실행되는 함수
    static void func(int... nums) {
        for(int num : nums)
            System.out.print(num + " ");
        System.out.println();
    }
}

package s06_03;

/**
 * 가변 인수 (Variadic Argument)
 * 메소드를 호출할 때 전달되는 인수의 개수가 고정되지 않은 인수
 * 메소드의 선언부에서 가변 인수를 전달받을 매개변수의 자료형 뒤에 `…`을 붙여 선언한다.
 */

public class L03_03 {
    public static void main(String[] args) {
        // 가변 인수가 매개변수 리스트의 가장 마지막 위치가 아닌 위치에 선언되면,
        // 메소드 호출 시 어떤 인수가 가변 인수/고정 인수에 해당하는지 해석하기가 모호해진다.
        func(1, 2, 3, 1, 2, 3, 4);
    }
    // 가변 인수를 전달받아 실행되는 함수
    // ⭐ 가변 인수를 전달받을 매개변수는 가장 마지막에 선언되어야 한다.
    static void func(int x, int y, int z, int... nums) {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        for(int num : nums)
            System.out.print(num + " ");
        System.out.println();
    }
}

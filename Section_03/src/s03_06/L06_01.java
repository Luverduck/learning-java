package s03_06;

/**
 * 자료형 추론 (Java 10+)
 * 변수 초기화 시 컴파일러가 초기화자(initializer)를 통해 해당 변수의 자료형을 추론하는 기능
 * 변수 초기화에서 자료형이 `var`인 변수는 자료형 추론의 대상이 된다.
 */

public class L06_01 {
    public static void main(String[] args) {
        // 자료형 추론
        var varInt = 1;
        var varDouble = 3.14;
        var varChar = 'A';
        var varString = "Hello!";

        // 배열에서의 자료형 추론
        // 배열에서 자료형 추론을 사용할 경우 new 키워드를 통한 초기화를 해야 한다.
        var varArr = new int[] { 1, 2, 3 };
    }
}

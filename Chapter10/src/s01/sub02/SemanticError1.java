package s01.sub02;

/**
 * 오류 (Error)
 * 프로그램의 비정상적인 동작 또는 그로 인해 작동을 멈추는 것
 * - 발생 원인에 따른 분류
 *     - 구문 오류 (Syntax Error)
 *     - 의미 오류 (Semantic Error)
 *     - 논리 오류 (Logical Error)
 */

public class SemanticError1 {
    public void main(String[] args) {
        // 의미 오류 (Semantic Error)
        // 프로그래밍 언어의 문법을 위배하지는 않았으나 잘못된 문법 사용으로 발생하는 에러

        // 정적 의미 오류 (Static Semantic Error) : 컴파일러가 감지할 수 있는 오류
        // 1) 초기화되지 않은 변수의 사용
        int i;
        //i++;                         // 초기화되지 않은 변수의 사용

        // 2) 호환되지 않는 타입
        //int a = "Hello";             // int형에 String형 리터럴을 대입할 수 없다.

        // 3) 표현식의 오류
        String s = "Hello";
        //int a = 5 - s;                // - 연산자는 String에 대한 연산을 지원하지 않는다.

        // 4) 알 수 없는 참조
        //Strin strin = "Hello";        // 정의되지 않은 클래스(Strin)의 참조
        //system.out.println("Hello");  // 정의되지 않은 클래스(system)의 참조
        String str;
        //str.println("Hello");         // 클래스(String)에 정의되지 않은 메소드의 참조
    }
}

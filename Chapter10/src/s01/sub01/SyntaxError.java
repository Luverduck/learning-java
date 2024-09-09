package s01.sub01;

/**
 * 오류 (Error)
 * 프로그램의 비정상적인 동작 또는 그로 인해 작동을 멈추는 것
 * - 발생 원인에 따른 분류
 *     - 구문 오류 (Syntax Error)
 *     - 의미 오류 (Semantic Error)
 *     - 논리 오류 (Logical Error)
 */

public class SyntaxError {
    public void main(String[] args) {
        // 구문 오류 (Syntax Error)
        // 프로그래밍 언어의 문법을 위배했을 때 발생하는 오류

        // 1) 세미 콜론(;)의 부재
        //int a                           // 문장의 마지막에 세미콜론(;)이 없는 경우

        // 2) 표현식의 오류
        //int x = ( 3 + 5;                // 괄호의 쌍이 맞지 않는 경우
        //int y = 3 + * 4;                // 연산자 사이에 피연산자가 없는 경우
    }
}

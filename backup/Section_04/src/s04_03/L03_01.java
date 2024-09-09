package s04_03;

/**
 * 증감 연산자 (Increment and Decrement Operator)
 * 피연산자의 값을 1만큼 증가/감소 시키는 연산자
 * 연산 수행 시점에 따라 전위 연산자(prefix operation)과 후위 연산(postfix operator)으로 나누어진다.
 */

public class L03_01 {
    public static void main(String[] args) {

        // 전위 증감 연산자 (Postfix Increment and Decrement Operator)
        // ++a	    먼저 피연산자의 값을 1만큼 증가시킨 후, 해당 연산을 수행한다.
        // --a	    먼저 피연산자의 값을 1만큼 감소시킨 후, 해당 연산을 수행한다.
        int a = 0;
        // 값을 증가시킨 후 출력
        System.out.println(++a);    // 결과 : 1
        System.out.println(++a);    // 결과 : 2
        System.out.println(++a);    // 결과 : 3

        // 후위 증감 연산자 (Postfix Increment and Decrement Operator)
        // a++	    먼저 해당 연산을 수행한 후, 피연산자의 크기를 1만큼 증가시킨다.
        // a--	    먼저 해당 연산을 수행한 후, 피연산자의 크기를 1만큼 감소시킨다.
        int b = 0;
        // 출력이 이루어진 후 값을 증가
        System.out.println(b++);    // 결과 : 0
        System.out.println(b++);    // 결과 : 1
        System.out.println(b++);    // 결과 : 2
    }
}

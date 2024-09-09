package s06_02;

/**
 * 인수의 전달
 * 메소드 호출 과정에서 인수를 메소드의 매개변수에 전달할 때
 * 인수에 저장된 값을 복사하여 매개변수에 전달하는 'call-by-value' 방식을 사용한다.
 * - 원시형(Primitive Type) 인수에 저장된 값을 매개변수에 복사한다.
 * - 참조형(Reference Type) 인수에 저장된 주소값을 매개변수에 복사한다.
 */

public class L02_01 {
    public static void main(String[] args) {
        // 원시형 변수 선언
        int a = 10;
        // 원시형 인수를 전달하여 함수 호출
        func(a);
        // 함수 실행 후 원시형 변수의 값 출력
        System.out.println(a); // 결과 : 10
    }

    // 매개변수가 원시형인 함수
    // ✅ 매개변수를 원시형 인수에 저장된 값으로 초기화
    static void func(int p) { // ✅ int p = a;
        // 매개변수에 저장된 값을 변경
        p = 100;
        // ⭐ 매개변수는 인수와 별개의 메모리를 사용한다.
        // ⭐ 매개변수 값의 변화는 함수 밖에서 유효하지 않다.
    }
}

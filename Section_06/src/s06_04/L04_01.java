package s06_04;

/**
 * 메소드의 반환형
 * 메소드 실행 후 메소드를 호출한 위치에 반환할 값의 자료형
 * `return` 문을 통해 반환할 값을 정의할 수 있으며 메소드 호출 표현식은 반환값으로 평가된다.
 */

public class L04_01 {
    public static void main(String[] args) {
        // 원시형 변수 선언
        int a = 10;
        // 메소드 호출
        func(a);
    }

    // 반환형이 void인 메소드
    static void func(int p) {
        // ⭐ 반환값이 없는 메소드로 정의된다.
        // return p + 100;
    }
}

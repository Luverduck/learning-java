package s10_03.L03_04;

/**
 * 자동 박싱 (Auto Boxing)과 자동 언박싱 (Auto Unboxing)
 * 컴파일러에 의해 자동으로 처리되는 박싱과 언박싱
 */

public class AutoUnboxing {
    public static void main(String[] args) {
        // ✅ 자동 언박싱이 발생하는 경우
        // 1. 래퍼 클래스 객체끼리 또는 원시 자료형과 래퍼 클래스의 객체 사이의 연산
        Integer wInt = 10;
        int pInt = 20;
        int result = wInt + pInt;
        // 2. 매개변수가 래퍼 클래스인 메소드에 원시 자료형 인수를 전달하여 호출
        printInt(wInt);
        // 3. 래퍼 클래스 객체를 조건문에 사용
        if(wInt > 100) {
            // ...
        }
    }
    static void printInt(int pInt) {
        System.out.println(pInt);
    }
}

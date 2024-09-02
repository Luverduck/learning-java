package s10_03.L03_04;

/**
 * 자동 박싱(Auto Boxing)과 자동 언박싱 (Auto Unboxing)
 * 컴파일러에 의해 자동으로 처리되는 박싱과 언박싱
 */

public class AutoBoxing {
    public static void main(String[] args) {
        // ✅ 자동 박싱이 발생하는 경우
        // 1. 래퍼 클래스형 변수에 값 할당
        Integer w_int = 10;
        // 2. 매개변수가 래퍼 클래스인 메소드에 원시 자료형 인수를 전달하여 호출
        int p_int = 100;
        printInteger(p_int);
    }
    static void printInteger(Integer w_int) {
        System.out.println(w_int);
    };
}

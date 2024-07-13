package s04_09;

/**
 * instanceof 연산자
 * 피연산자가 특정 클래스의 인스턴스인지 여부를 판정하는 연산자
 */

public class L09_01 {
    public static void main(String[] args) {
        // ✅ instanceof 연산자
        // instanceof	    왼쪽 피연산자가 오른쪽 피연산자의 자료형으로 형 변환이 가능하면 true를 반환한다.
        boolean a = "Hello!" instanceof String;
    }
}

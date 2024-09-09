package s02_06;

/**
 * 식별자 (Identifier)
 * 변수, 함수, 클래스 등의 프로그래밍 언어의 구성 요소의 이름
 */

public class L06_02 {
    public static void main(String[] args) {
        // 식별자의 명명 관례 (convention)
        // 1. 변수나 메소드의 이름은 낙타 표기법(camel case)으로 작성한다.
        int myAge = 32;

        // 2. 상수의 이름은 대문자와 언더스코어 '_'만으로 작성한다.
        final String COMPANY_NAME = "KAKAO";

        // 3. 클래스의 이름은 대문자로 시작하도록 작성한다.
        class Point {
            double x;
            double y;
        }
    }
}

package s02_05;

/**
 * 변수 (Variable)
 * 데이터를 저장하는 공간 (메모리)을 의미한다.
 * 특정 값을 여러 부분에서 공통적으로 사용할 때 그 값을 변수화하는 것이 유지보수하기 좋다.
 */

public class L05_03 {
    public static void main(String[] args) {
        // 변수의 특징
        // 1. 변수의 자료형과 일치하지 않는 데이터(리터럴)은 변수에 저장할 수 없다.
        int age = 20;
        boolean isMarried = false;
        double height = 179.99;
        char sex = 'M';
        String name = "홍길동";

        //age = false;
        // java: incompatible types: boolean cannot be converted to int
        //isMarried = "안함";
        // java: incompatible types: java.lang.String cannot be converted to boolean
        //sex = 1.2
        // java: incompatible types: possible lossy conversion from double to char
        //name = 3;
        // java: incompatible types: int cannot be converted to java.lang.String

        // 2. 쉼표 연산자 ,를 통해 같은 자료형의 변수를 한 줄에 여러 개 선언할 수 있다.
        char ch1, ch2, ch3; // 선언
        char ch4 = 'A', ch5 = 'B', ch6 = 'C'; // 선언과 초기화

        // 3. 같은 이름의 변수를 여러 번 선언할 수 없다.
        int number = 1;
        //int number = 2;
        // Variable 'number' is already defined in the scope

        // 4. 초기화되지 않은 변수는 사용할 수 없다.
        char letter;
        //System.out.println(letter);
        // Variable 'letter' might not have been initialized
    }
}

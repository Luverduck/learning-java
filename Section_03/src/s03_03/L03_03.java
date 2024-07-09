package s03_03;

/**
 * 자료형 승격 (Type Promotion)
 * 표현식의 평가 중 발생하는 컴파일러에 의해 자동으로 수행되는 자료형 변환
 */

public class L03_03 {
    public static void main(String[] args) {
        // 자료형의 승격
        byte _1b_byte = 50;
        // _1b_byte = _1b_byte * 2;  // java: incompatible types: possible lossy conversion from int to byte
        // 1. 표현식 _1b_byte = _1b_byte * 2을 평가할 때 연산자 *에 대한 피연산자는 _1b_byte와 2이다.
        // 2. `byte`형 변수 `_1b_byte`와 `int`형 리터럴 `2`의 자료형이 다르므로 `_1b_byte`를 `int`로 승격시킨다.
        // 3. 자료형 승격 후 표현식 _1b_byte * 2을 평가한다. 이때 평가 결과의 자료형은 int이다.
        // 4. byte형 변수 _1b_byte는 int형 평가 결과를 저장할 수 없으므로 컴파일 오류가 발생한다.
    }
}

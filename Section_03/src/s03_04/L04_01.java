package s03_04;

/**
 * 배열 (Array)
 * 배열은 특정한 자료형의 메모리가 연속적으로 나열된 형태의 자료 구조이다.
 * ⚠ 컴파일 언어 특성상 한 번 선언된 배열은 길이를 변경할 수 없다.
 */

public class L04_01 {
    public static void main(String[] args) {
        // 배열의 선언
        // 배열은 배열 요소가 될 자료형 뒤에 []를 붙인 자료형[] 형태의 자료형으로 선언된다.
        byte[] arrByte;
        // 해당 자료형은 메모리 주소를 저장하는 참조형(Reference type)이다.
        // 배열 변수의 메모리는 스택(Stack) 영역에 할당된다.
        // ⭐ C/C++의 배열 선언 문법도 허용한다.
        int arrInt[];
    }
}

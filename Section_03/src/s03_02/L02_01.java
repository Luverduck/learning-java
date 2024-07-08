package s03_02;

/**
 * 변수의 자료형
 * Java에서 변수의 자료형은 크게 원시형(Primitive type)과 참조형(Reference type)으로 나누어진다.
 */

public class L02_01 {
    public static void main(String[] args) {
        // 원시형(Primitive type)
        // 리터럴을 저장하는 자료형이다.
        // 원시형 변수는 스택(Stack) 영역에 저장된다.
        // 정수형, 실수형, 논리형, 문자형이 원시형에 해당한다.
        int age = 32;
        double height = 175.6;
        boolean hasJob = true;
        char sex = 'M';

        // 참조형(Reference type)
        // 리터럴이 저장된 메모리 주소를 저장하는 자료형이다.
        // 참조형 변수는 스택(Stack) 영역에, 변수가 가리키는 리터럴은 힙(Heap) 영역에 저장된다.
        // 원시형을 제외한 모든 자료형이 참조형에 해당한다.
        String name = "Thomas";
    }
}

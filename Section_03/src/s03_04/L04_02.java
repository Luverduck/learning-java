package s03_04;

/**
 * 배열의 초기화
 * 배열은 초기화 과정을 통해 배열 요소에 해당하는 메모리를 할당받는다.
 * 배열은 다음의 2가지 방식으로 초기화될 수 있다.
 * 1) new 키워드를 이용한 초기화
 * 2) 배열 리터럴을 이용한 초기화
 */

public class L04_02 {
    public static void main(String[] args) {
        // 'new' 키워드를 이용한 초기화
        // 'new' 키워드는 메모리를 동적으로 할당한 후 해당 메모리의 주소를 반환하는 연산자(opeartor)이다.
        // 'new' 키워드를 통해 배열 변수를 초기화할 수 있다.
        short[]     arrShort    = new short[3];

        // 'new' 키워드로 배열 변수를 초기화하는 과정은 다음과 같다.
        // 1. 배열 요소가 될 자료형 크기 메모리를 `[]` 안의 수만큼 동적으로 할당한다.
        // 2. 동적으로 할당한 메모리를 기본값으로 초기화한다.
        // 3. 초기화가 끝나면 해당 메모리의 시작 주소를 배열 변수에 저장한다.

        // 배열 변수를 초기화할 때 배열의 모든 요소는 기본값으로 초기화된다.
        int[]       arrInt      = new int[3];       // { 0, 0, 0 }
        double[]    arrDouble   = new double[3];    // { 0.0, 0.0, 0.0 }
        boolean[]   arrBoolean  = new boolean[3];   // { false, false, false }
        char[]      arrChar     = new char[3];      // { '\u0000', '\u0000', '\u0000' }
        String[]    arrString   = new String[3];    // { null, null, null }
    }
}

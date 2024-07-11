package s03_04;

import java.util.Arrays;

/**
 * 배열의 초기화
 * 배열 요소의 메모리를 할당한 후 해당 메모리의 시작 주소를 배열 변수에 저장하는 과정이다.
 * 배열 변수의 메모리는 스택(Stack) 영역에, 배열 요소의 메모리는 힙(Heap) 영역에 할당된다.
 */

public class L04_02 {
    public static void main(String[] args) {
        // ✅ 배열 변수는 new 키워드를 이용하여 초기화할 수 있다.
        // new 키워드는 메모리를 동적 할당 후 해당 메모리의 시작 주소를 반환하는 연산자(opeartor)이다.
        short[]     arrShort    = new short[3];
        // new 키워드로 배열 변수를 초기화할 때 배열의 모든 요소는 기본값으로 초기화된다.
        int[]       arrInt      = new int[3];       // { 0, 0, 0 }
        double[]    arrDouble   = new double[3];    // { 0.0, 0.0, 0.0 }
        boolean[]   arrBoolean  = new boolean[3];   // { false, false, false }
        char[]      arrChar     = new char[3];      // { '\u0000', '\u0000', '\u0000' }
        String[]    arrString   = new String[3];    // { null, null, null }

        // ✅ 배열 변수를 초기화할 때 배열 초기화자(Array Initializer)로 배열 요소들을 초기화할 수 있다.
        byte[]      arrByte     = new byte[] { 1, 2, 3 };

        // ✅ 배열 변수를 초기화할 때 new 키워드 없이 배열 초기화자 만으로 배열 요소들을 초기화할 수 있다.
        long[]      arrLong     = { 1L, 2L, 3L };
        // * 해당 방식의 초기화는 배열을 선언할 때 최초 1회만 사용할 수 있다.
        // arrLong = { 4L, 5L, 6L }; // Array initializer is not allowed here

        // ✅ 배열의 길이는 배열의 length 속성에 정의되어 있다.
        int[] arr = new int[] {1, 2, 3, 4, 5};
        int arrLength = arr.length; // 5
    }
}

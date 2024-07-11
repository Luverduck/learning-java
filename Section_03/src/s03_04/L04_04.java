package s03_04;

/**
 * 배열의 얕은 복사 (Shallow Copy)
 * 하나의 배열에 다른 배열의 주소를 복사하는 것을 얕은 복사(Shallow Copy)라 한다.
 * 얕은 복사가 이루어진 배열은 원본 배열과 동일한 메모리를 가리키게 된다.
 * 배열의 얕은 복사는 배열 변수간의 대입 연산을 통해 이루어진다.
 */

public class L04_04 {
    public static void main(String[] args) {
        // 다음과 같이 초기화된 두 배열 변수 arrA와 arrB가 있다.
        int[] arrA = new int[] { 1, 2, 3 };
        int[] arrB = new int[] { 4, 5, 6, 7 };

        // arrA에 arrB를 대입하면 arrA에는 arrB의 배열 요소가 저장된 메모리의 시작 주소가 저장된다.
        arrA = arrB;

        // arrA와 arrB에 저장된 메모리 주소가 같으므로 동일한 메모리를 가리키게 된다.
        for(int i : arrA)
            System.out.print(i + " ");
        System.out.println();
        for(int i : arrB)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("--------------------------");

        // arrB[1]의 메모리에 새로운 값 7을 대입하면 해당 메모리에 저장된 값이 변경된다.
        arrB[1] = 10;

        // arrA는 arrB와 같은 메모리를 가리키므로 arrA[1]의 메모리에 저장된 값 또한 7이 된다.
        for(int i : arrA)
            System.out.print(i + " ");
        System.out.println();
        for(int i : arrB)
            System.out.print(i + " ");
    }
}

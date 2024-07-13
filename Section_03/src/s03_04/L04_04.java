package s03_04;

/**
 * 배열의 요소 접근
 * 배열은 인덱스 연산자 []를 통해 배열의 특정 요소에 접근할 수 있다.
 */

public class L04_04 {
    public static void main(String[] args) {
        // 배열의 요소 접근
        int[] arr = new int[] { 0, 1, 2, 3 };

        // ✅ 인덱스 연산을 통해 배열의 특정 요소에 접근할 수 있다.
        int element = arr[1];
        System.out.println(element);    // 결과 : 1
        
        // 배열의 특정 요소에 접근한 후 대입 연산을 통해 해당 요소에 값을 저장할 수 있다.
        arr[1] = 5;
    }
}

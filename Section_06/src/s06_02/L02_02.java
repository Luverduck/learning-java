package s06_02;

/**
 * 인수의 전달
 * 메소드 호출 과정에서 인수를 메소드의 매개변수에 전달할 때
 * 인수에 저장된 값을 복사하여 매개변수에 전달하는 'call-by-value' 방식을 사용한다.
 * - 원시형(Primitive Type) 인수에 저장된 값을 매개변수에 복사한다.
 * - 참조형(Reference Type) 인수에 저장된 주소값을 매개변수에 복사한다.
 */

public class L02_02 {
    public static void main(String[] args) {
        // 참조형 변수 선언
        int[] arr = new int[] { 10, 20, 30 };
        // 참조형 인수를 전달하여 함수 호출
        func(arr);
        for(int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " "); // 결과 : 100 20 30
    }

    // 매개변수가 참조형인 함수
    // ✅ 매개변수를 참조형 인수에 저장된 주소값으로 초기화
    static void func(int[] pArr) { // ✅ int[] pArr = arr;
        // 매개변수에 저장된 주소를 참조하여 해당 주소의 0번째 요소의 값을 변경
        pArr[0] = 100;
        // ⭐ 매개변수는 인수와 별개의 메모리를 사용하지만 저장된 주소값은 동일한 메모리를 가리킨다.
        // ⭐ 매개변수의 참조를 통한 메모리값의 변화는 함수 밖에서도 유효하다.
    }
}

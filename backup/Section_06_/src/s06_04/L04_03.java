package s06_04;

public class L04_03 {
    public static void main(String[] args) {
        // 참조형 변수 선언
        int[] arr = new int[] { 10, 20, 30 };
        // 메소드 호출
        int[] retVal = func(arr); // ⭐ 메소드 호출 표현식 func(arr)는 pArr에 저장된 주소값으로 평가된다.
        // 반환값 출력
        for(int i = 0; i < retVal.length; ++i)
            System.out.print(retVal[i] + " "); // 결과 : 100 20 30
    }

    // 반환형이 원시형인 메소드
    static int[] func(int[] pArr) {
        // 매개변수에 저장된 주소를 참조하여 해당 주소의 0번째 요소의 값을 변경
        pArr[0] = 100;
        // 참조형 반환
        return pArr;
    }
}

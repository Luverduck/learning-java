package s06_04;

public class L04_02 {
    public static void main(String[] args) {
        // 원시형 변수 선언
        int a = 10;
        // 메소드 호출
        int retVal = func(a); // ⭐ 메소드 호출 표현식 func(a)는 110으로 평가된다.
        // 반환값 출력
        System.out.println(retVal);
    }

    // 반환형이 원시형인 메소드
    static int func(int p) {
        // 원시형 반환
        return p + 100;
    }
}

package s05_06;

/**
 * return 문
 * 함수의 실행을 종료시킨 후 함수 호출 지점으로 제어 흐름을 이동시킨다.
 * 함수의 반환형에 따라 함수 호출 지점에 반환값을 전달한다.
 */

public class L06_04 {
    public static void main(String[] args) {
        // ✅ return 문
        int a = 10;
        int b = 20;
        int ret = func(a, b);
        System.out.println(ret);
    }
    
    // 함수
    static int func(int x, int y) {
        int result = x + y;
        return result;
    }
}

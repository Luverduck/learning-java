package s05_06;

/**
 * break 문
 * 반복문을 완전히 종료시킨 후 다음 실행할 코드로 제어 흐름을 이동시킨다.
 */

public class L06_01 {
    public static void main(String[] args) {
        // ✅ break 문
        int num = 0;
        System.out.println("시작");
        while(num < 10)
        {
            num++;
            if(num == 5) break;
            System.out.println(num);
        }
        System.out.println("끝");
    }
}

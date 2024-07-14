package s05_06;

/**
 * continue 문
 * 반복문에서 현재 반복(iteration)을 종료시킨 후 다음 반복으로 제어 흐름을 이동시킨다.
 */

public class L06_02 {
    public static void main(String[] args) {
        // ✅ continue 문
        // while 문의 경우 조건식으로 이동한다.
        int num = 0;
        System.out.println("시작");
        while(num < 10)
        {
            num++;
            if(num % 2 == 0) continue;
            System.out.println(num);
        }
        System.out.println("끝");
    }
}

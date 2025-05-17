package part_01.chapter_10.s10_01.t01_03;

public class LogicalError {

    // 논리 오류 (Logical Error)
    // 1) 잘못된 논리 구성
    int mod(int a, int b)
    {
        return a % b;             // 몫을 구하는 메소드에서 나머지 반환
    };

    public static void main(String[] args) {

        // 2) 무한 루프
        int i = 0;
        while(i < 10)                 // 잘못된 종료 조건으로 인한 무한 루프
        {
            System.out.println(i);
        };

    }
}

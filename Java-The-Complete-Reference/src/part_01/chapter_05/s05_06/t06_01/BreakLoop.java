package part_01.chapter_05.s05_06.t06_01;

public class BreakLoop {
    public static void main(String[] args) {

        //
        int n = 0;
        System.out.println("루프 시작 [n = %d]".formatted(n));
        while(true)
        {
            if(n > 10) break;
            n++;
        }
        System.out.println("루프 종료 [n = %d]".formatted(n));

    }
}

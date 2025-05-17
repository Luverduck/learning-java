package part_01.chapter_05.s05_04.t04_05;

public class WhileInfiniteLoopControl {
    public static void main(String[] args) {

        // while문의 무한 루프 제어
        int n = 0;
        while(true)
        {
            if(n > 10) break;
            System.out.println(n);
            n++;
        }

    }
}

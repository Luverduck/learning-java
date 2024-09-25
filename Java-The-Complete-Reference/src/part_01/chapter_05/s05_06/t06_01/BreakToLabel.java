package part_01.chapter_05.s05_06.t06_01;

public class BreakToLabel {
    public static void main(String[] args) {

        outer:
        for(int i = 0; i < 20; ++i)
        {
            inner:
            for(int j = 0; j < 10; ++j)
            {
                if(j == 5)
                {
                    System.out.println("inner로 이동 [%d, %d]".formatted(i, j));
                    break inner;
                }
                if(j == 3 && i == 3)
                {
                    System.out.println("outer로 이동 [%d, %d]".formatted(i, j));
                    break outer;
                }
            }
        }

    }
}

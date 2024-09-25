package part_01.chapter_05.s05_05.t05_01;

public class UsingComma {
    public static void main(String[] args) {

        // 콤마(,)의 사용
        for(int i = 1, j = 2; i < 10 && j < 20; i++, j++)
        {
            System.out.println("%d %d".formatted(i, j));
        }

    }
}

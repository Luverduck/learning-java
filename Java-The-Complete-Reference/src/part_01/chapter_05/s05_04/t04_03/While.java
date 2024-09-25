package part_01.chapter_05.s05_04.t04_03;

public class While {
    public static void main(String[] args) {

        // while문은 루프 진입 시점부터 조건 표현식을 평가한다.
        int n = 5;
        while(n < 5)
        {
            System.out.printf("%d ".formatted(n));
            n++;
        }

    }
}

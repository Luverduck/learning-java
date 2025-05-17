package part_01.chapter_05.s05_04.t04_03;

public class DoWhile {
    public static void main(String[] args) {

        // do-while문은 루프 반복 시점부터 조건 표현식을 평가한다.
        int n = 5;
        do {
            System.out.printf("%d ".formatted(n));
            n++;
        } while(n < 5);

    }
}

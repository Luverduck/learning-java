package part_01.chapter_05.s05_05.t05_05;

public class ForTypeInference {
    public static void main(String[] args) {

        // for문에서의 자료형 추론
        for(var i = 0; i < 10; ++i)
            System.out.printf("%d ".formatted(i));

        System.out.print("\n");

        for(var c = 'a'; c <= 'z'; ++c)
            System.out.printf("%c ".formatted(c));

    }
}

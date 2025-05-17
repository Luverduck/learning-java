package part_01.chapter_03.s03_03.t03_04;

public class EscapeSequence {
    public static void main(String[] args) {

        // 이스케이프 시퀀스 (Escape Sequence)
        System.out.println("\\' : %c".formatted('\''));
        System.out.println("\\\" : %c".formatted('\"'));
        System.out.println("\\\\ : %c".formatted('\\'));
        System.out.println("\\n : %c".formatted('\n'));
        System.out.println("\\r : %c".formatted('\n'));
        System.out.println("\\t : %c".formatted('\t'));
        System.out.println("\\b : %c".formatted('\b'));
        System.out.println("\\f : %c".formatted('\f'));

    }
}

package part_01.chapter_05.s05_06.t06_01;

public class BreakSwitch {
    public static void main(String[] args) {

        //
        int n = 2;
        switch(n)
        {
            case 1:
                System.out.println("문장 A 실행");
            case 2:
                System.out.println("문장 B 실행");
            case 3:
                System.out.println("문장 C 실행");
                break;
            case 4:
                System.out.println("문장 D 실행");
            default:
                System.out.println("기본 문장 실행");
        }
        System.out.println("문장 실행 종료");

    }
}

package part_01.chapter_05.s05_03.t03_03;

public class MultiCaseLabel {
    public static void main(String[] args) {

        // switch문의 case에 break를 생략하는 경우
        int x = 3;
        int y = 2;

        switch(x + y)
        {
            case 3:
                System.out.println("A");
                break;
            case 5:
                System.out.println("B");
            case 8:
                System.out.println("C");
                break;
            default:
                System.out.println("X");
                break;
        }

    }
}

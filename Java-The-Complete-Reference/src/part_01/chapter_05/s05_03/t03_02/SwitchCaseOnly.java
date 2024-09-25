package part_01.chapter_05.s05_03.t03_02;

public class SwitchCaseOnly {
    public static void main(String[] args) {

        // switch문에서 default문의 생략
        int x = 6;
        int y = 3;

        switch(x + y)
        {
            case 3:
                System.out.println("A");
                break;
            case 5:
                System.out.println("B");
                break;
            case 8:
                System.out.println("C");
                break;
        }

    }
}

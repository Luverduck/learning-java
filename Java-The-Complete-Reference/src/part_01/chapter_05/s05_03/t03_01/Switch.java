package part_01.chapter_05.s05_03.t03_01;

public class Switch {
    public static void main(String[] args) {

        // switch문
        int x = 5;
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
            default:
                System.out.println("X");
                break;
        }

    }
}

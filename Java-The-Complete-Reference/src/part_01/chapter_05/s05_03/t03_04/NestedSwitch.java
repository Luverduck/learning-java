package part_01.chapter_05.s05_03.t03_04;

public class NestedSwitch {
    public static void main(String[] args) {

        // 중첩된 switch문
        int x = 5;
        int y = 3;

        switch(x + y)
        {
            case 3:
                System.out.println("A");
                switch(x)
                {
                    case 1:
                        System.out.println("A && P");
                        break;
                    case 3:
                        System.out.println("A && Q");
                        break;
                    default:
                        System.out.println("A && X");
                }
                break;
            case 5:
                System.out.println("B");
                break;
            case 8:
                System.out.println("C");
                switch(y)
                {
                    case 1:
                        System.out.println("C && R");
                        break;
                    case 3:
                        System.out.println("C && S");
                        break;
                    default:
                        System.out.println("C && X");
                }
                break;
            default:
                System.out.println("X");
                break;
        }
        
    }
}

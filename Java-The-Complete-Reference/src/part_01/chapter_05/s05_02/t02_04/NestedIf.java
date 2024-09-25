package part_01.chapter_05.s05_02.t02_04;

public class NestedIf {
    public static void main(String[] args) {

        // 중첩 if문
        int x = 5;
        int y = 3;

        if(x + y > 8)
        {
            System.out.println("A");

            if(x > 5)
                System.out.println("A && P");

            if(y > 5)
                System.out.println("A && Q");
            else
                System.out.println("A && ~Q");
        }
        else
        {
            System.out.println("~A");

            if(x > 3)
                System.out.println("A && R");
            else
                System.out.println("A && ~R");
        }

    }
}

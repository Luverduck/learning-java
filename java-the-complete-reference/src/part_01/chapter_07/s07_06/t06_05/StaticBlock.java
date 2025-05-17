package part_01.chapter_07.s07_06.t06_05;

import java.util.*;

public class StaticBlock {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int input = sc.nextInt();
            if(input == 0) break;
            System.out.println("MyClass.iFieldStatic : %d".formatted(MyClass.iFieldStatic));
        }
        sc.close();

    }
}

package part_01.chapter_10.s10_04.t04_05;

import java.util.*;

public class NestedTry {

    // main 메소드
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("프로그램 시작");
        int input;
        while(true)
        {
            System.out.println("입력 (0을 입력하는 경우 종료) : ");
            input = sc.nextInt();
            if(input == 0) break;
            vMethod(input);
        }
        System.out.println("프로그램 종료");
        sc.close();
    }

    // vMethod 메소드
    static void vMethod(int x) {
        System.out.println("vMethod 호출");
        try {
            try {
                if(x == 1) x = x / (x - x);
                if(x == 2) {
                    int[] arr = new int[x];
                    arr[x] = 20;
                }
            }
            catch(ArithmeticException e) {
                System.out.println("vMethod의 내부 catch절 실행 [ %s ]".formatted(e.toString()));
            }
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("vMethod의 외부 catch절 실행 [ %s ]".formatted(e.toString()));
        }
        System.out.println("vMethod 종료");
    }

}

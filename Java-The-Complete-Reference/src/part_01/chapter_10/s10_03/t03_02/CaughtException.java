package part_01.chapter_10.s10_03.t03_02;

import java.util.*;

public class CaughtException {

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
            vMethod1();
        }
        System.out.println("프로그램 종료");
        sc.close();
    }

    // vMethod1 메소드
    static void vMethod1() {
        System.out.println("method1 호출");
        vMethod2();
        System.out.println("method1 종료");
    }

    // vMethod2 메소드
    static void vMethod2() {
        System.out.println("method2 호출");
        // vMethod3 메소드에서 발생한 예외 처리
        try {
            vMethod3();
        }
        catch(Exception e) {
            System.out.println("처리된 예외 : " + e.toString());
        }
        System.out.println("method2 종료");
    }

    // vMethod3 메소드
    static void vMethod3() {
        System.out.println("method3 호출");
        int x = 10;
        int y = 0;
        int ret = x / y;
        System.out.println("method3 종료");
    }

}
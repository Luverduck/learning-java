package part_01.chapter_10.s10_05.t05_01;

import java.util.*;

public class ThrowException {

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
    static void vMethod(int iParam) {
        System.out.println("vMethod 호출");
        try {
            if(iParam == 1)
                vMethod1();
            else if(iParam == 2)
                vMethod2();
            else
                vMethod3();
        }
        catch(Exception e) {
            System.out.println("vMethod의 catch 블록 실행 [ %s ]".formatted(e.toString()));
        }
        System.out.println("vMethod 호출");
    }

    // vMethod1 메소드
    static void vMethod1() {
        System.out.println("vMethod1 호출");
        throw new ArrayIndexOutOfBoundsException();
        //System.out.println("vMethod1 종료");
    }

    // vMethod2 메소드
    static void vMethod2() {
        System.out.println("vMethod2 호출");
        try {
            throw new ArithmeticException();
        }
        catch(ArithmeticException e) {
            System.out.println("vMethod2의 catch 블록 실행 [ %s ]".formatted(e.toString()));
        }
        System.out.println("vMethod2 종료");
    }

    // vMethod3 메소드
    static void vMethod3() {
        System.out.println("vMethod3 호출");
        throw new Error();
        //System.out.println("vMethod3 종료");
    }

}

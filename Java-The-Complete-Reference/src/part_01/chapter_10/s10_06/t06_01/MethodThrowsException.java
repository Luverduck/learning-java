package part_01.chapter_10.s10_06.t06_01;

import java.util.*;

public class MethodThrowsException {

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
        if(iParam == 1)
            // vMethod1에서 검사 예외가 발생할 경우 호출자인 vMethod에서 처리한다.
            try {
                vMethod1();
            }
            catch(Exception e) {
                System.out.println("vMethod2 호출 시 발생한 예외 처리");
            }
        else if(iParam == 2)
            vMethod2();
        System.out.println("vMethod 호출");
    }

    // vMethod1 메소드
    static void vMethod1() throws ClassNotFoundException {
        System.out.println("vMethod1 호출");
        throw new ClassNotFoundException();
        //System.out.println("vMethod1 종료");
    }

    // vMethod2 메소드
    static void vMethod2() {
        System.out.println("vMethod2 호출");
        // vMethod3에서 검사 예외가 발생할 경우 vMethod3에서 직접 처리한다.
        try {
            System.out.println("vMethod2의 try 블록 실행");
            throw new NoSuchMethodException();
        }
        catch(Exception e) {
            System.out.println("vMethod2의 catch 블록 실행");
        }
        System.out.println("vMethod2 종료");
    }

}

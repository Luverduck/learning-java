package part_01.chapter_10.s10_04.t04_04;

import java.util.*;

public class MultiCatch {

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
            try {
                if(input == 1)
                    vMethod1(); // IndexOutOfBoundException
                else if(input == 2)
                    vMethod2(); // NullPointerException
                else if(input == 3)
                    vMethod3(); // ArithmeticException
            }
            catch(IndexOutOfBoundsException e) {
                System.out.println("첫 번째 catch 블록 실행 [ %s ]".formatted(e.toString()));
            }
            catch(NullPointerException e) {
                System.out.println("두 번째 catch 블록 실행 [ %s ]".formatted(e.toString()));
            }
            catch(Exception e) {
                System.out.println("세 번째 catch 블록 실행 [ %s ]".formatted(e.toString()));
            }
        }
        System.out.println("프로그램 종료");
        sc.close();
    }

    // vMethod1 메소드 >> IndexOutOfBoundException
    static void vMethod1() {
        System.out.println("method1 호출");
        int arr[] = new int[3];
        arr[3] = 10;
        System.out.println("method1 종료");
    }

    // vMethod2 메소드 >> NullPointerException
    static void vMethod2() {
        System.out.println("method2 호출");
        String str = null;
        str.toLowerCase();
        System.out.println("method2 종료");
    }

    // vMethod3 메소드 >> ArithmeticException
    static void vMethod3() {
        System.out.println("method3 호출");
        int x = 10;
        int y = 0;
        int res = x / y;
        System.out.println("method3 종료");
    }

}

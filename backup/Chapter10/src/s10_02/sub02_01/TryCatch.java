package s10_02.sub02_01;

import java.util.*;

public class TryCatch {
    public static void main(String[] args) {

        System.out.println("프로그램 실행");

        int array[] = new int[10];
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            try {
                int i = sc.nextInt();
                if(i == 100) break;
                array[i]++;
            }
            catch(Exception e)
            {
                System.out.println("배열 인덱스 초과");
            }
            System.out.println("프로그램 실행 중");
        }

        sc.close();
        //
        System.out.println("프로그램 종료");
    }
}

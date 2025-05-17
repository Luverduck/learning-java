package part_01.chapter_05.s05_04.t04_04;

import java.util.*;
import java.io.IOException;

public class DoWhileExample {
    public static void main(String[] args) throws IOException {

        // do-while문의 활용
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("5 이하의 숫자만 입력하시오.");
            n = sc.nextInt();
        } while(n < 5);

        System.out.println("5 이상의 숫자를 입력받았습니다.");

    }
}

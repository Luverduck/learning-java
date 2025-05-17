package part_01.chapter_07.s07_03.t03_02;

import java.util.*;

public class ReturnReference {
    public static void main(String[] args) {

        // 클래스의 인스턴스 생성
        MyClass m = new MyClass();

        // 참조의 반환 (Return Reference)
        int[] ret = m.method();
        System.out.println(ret);
        System.out.println(Arrays.toString(ret));

    }
}

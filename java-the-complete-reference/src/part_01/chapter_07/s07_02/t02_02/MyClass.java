package part_01.chapter_07.s07_02.t02_02;

import java.util.Arrays;

public class MyClass {

    // 참조에 의한 호출 (Call By Reference)
    void method(int[] rParam) {
        System.out.println("참조에 의한 호출");
        System.out.println(rParam);
        System.out.println(Arrays.toString(rParam));
    }

}

package part_01.chapter_05.s05_05.t05_05;

import java.util.*;

public class ForEachTypeInference {
    public static void main(String[] args) {

        // for-each문에서의 자료형 추론
        int[] arr = { 0, 1, 2, 3, 4, 5 };
        for(var i : arr)
            System.out.print(i + " ");

        System.out.print("\n");

        List<Integer> list = new ArrayList<>(List.of( 0, 1, 2, 3, 4, 5 ));
        for(var i : list)
            System.out.print(i + " ");

    }
}

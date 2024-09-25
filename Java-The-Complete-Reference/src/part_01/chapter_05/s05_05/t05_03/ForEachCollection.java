package part_01.chapter_05.s05_05.t05_03;

import java.util.*;

public class ForEachCollection {
    public static void main(String[] args) {

        // for-each문
        List<Integer> list = new ArrayList<>(List.of( 1, 2, 3, 4, 5 ));
        for(int i : list)
            System.out.println(i);

    }
}

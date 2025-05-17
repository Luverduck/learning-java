package part_01.chapter_05.s05_05.t05_04;

import java.util.*;

public class ForEachCollectionImplement {
    public static void main(String[] args) {

        // for-each문의 내부적 구현 (컬렉션 순회)
        List<Integer> list = new ArrayList<>(List.of( 1, 2, 3, 4, 5 ));
        for(int i : list)
            System.out.printf("%d ".formatted(i));

        System.out.println("\n-----------");

        for(Iterator<Integer> it = list.iterator(); it.hasNext(); )
            System.out.printf("%d ".formatted(it.next()));

    }
}

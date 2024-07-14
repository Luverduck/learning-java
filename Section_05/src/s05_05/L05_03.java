package s05_05;

import java.util.*;

/**
 * for-each 문
 * 배열, collection의 마지막 요소에 도달할 때까지 for 문의 코드 블록 안에 있는 문장을 반복 실행한다.
 */

public class L05_03 {
    public static void main(String[] args) {
        // ✅ collection에 대한 for-each 문
        List<Integer> list = new ArrayList<>(List.of( 0, 1, 2, 3, 4, 5 ));
        for(int num : list)
            System.out.print(num + " ");

        System.out.println("\n------------");

        // ✅ 내부적 구현
        for(Iterator<Integer> it = list.iterator(); it.hasNext(); )
        {
            int num = it.next();
            System.out.print(num + " ");
        }
    }
}

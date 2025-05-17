package part_01.chapter_05.s05_05.t05_06;

public class NestedFor {
    public static void main(String[] args) {

        // 중첩된 for문
        for(int i = 0; i < 2; ++i)
        {
            for(int j = 0; j < 3; ++j)
            {
                System.out.println(i + " " + j);
            }
        }

    }
}

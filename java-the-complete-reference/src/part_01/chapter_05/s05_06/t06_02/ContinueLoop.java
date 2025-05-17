package part_01.chapter_05.s05_06.t06_02;

public class ContinueLoop {
    public static void main(String[] args) {

        for(int i = 0; i < 10; ++i)
        {
            if(i % 2 != 0) continue;
            System.out.println(i);
        }

    }
}

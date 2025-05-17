package part_01.chapter_05.s05_05.t05_04;

public class ForEachArrayImplement {
    public static void main(String[] args) {

        // for-each문의 내부적 구현 (배열 순회)
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        for(int i : arr)
            System.out.printf("%d ".formatted(i));

        System.out.println("\n-----------");

        for(int idx = 0; idx < arr.length; ++idx)
            System.out.printf("%d ".formatted(arr[idx]));

    }
}

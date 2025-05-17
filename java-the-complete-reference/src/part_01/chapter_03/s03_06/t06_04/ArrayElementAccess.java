package part_01.chapter_03.s03_06.t06_04;

public class ArrayElementAccess {
    public static void main(String[] args) {

        // 배열의 요소 접근
        int[] iArray = { 1, 2, 3 };

        // 배열의 0번째 요소 출력
        System.out.println(iArray[0]);
        // 배열의 1번째 요소에 5 저장
        iArray[1] = 5;
        // 배열의 2번째 요소에 10 저장
        iArray[2] = 10;

        System.out.println("%d %d %d".formatted(iArray[0], iArray[1], iArray[2]));
    }
}

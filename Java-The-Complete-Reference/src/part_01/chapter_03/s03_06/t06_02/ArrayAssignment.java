package part_01.chapter_03.s03_06.t06_02;

public class ArrayAssignment {
    public static void main(String[] args) {

        // 배열에 참조 할당
        int[] iArrayOrigin = { 1, 2, 3 };
        int[] iArrayTemp;

        // 배열 변수 iArrayTemp에 iArrayOrigin의 참조를 저장
        iArrayTemp = iArrayOrigin;
        System.out.println("%d %d %d".formatted(iArrayOrigin[0], iArrayOrigin[1], iArrayOrigin[2]));
        System.out.println("%d %d %d".formatted(iArrayTemp[0], iArrayTemp[1], iArrayTemp[2]));

        // iArrayTemp의 0번째 요소의 값을 5로 변경
        iArrayTemp[0] = 5;
        System.out.println("%d %d %d".formatted(iArrayOrigin[0], iArrayOrigin[1], iArrayOrigin[2]));
        System.out.println("%d %d %d".formatted(iArrayTemp[0], iArrayTemp[1], iArrayTemp[2]));

        // iArrayTemp의 0번째 요소의 값을 5로 변경
        iArrayOrigin[1] = 6;
        System.out.println("%d %d %d".formatted(iArrayOrigin[0], iArrayOrigin[1], iArrayOrigin[2]));
        System.out.println("%d %d %d".formatted(iArrayTemp[0], iArrayTemp[1], iArrayTemp[2]));

    }
}

package part_01.chapter_03.s03_07.t07_04;

public class Array2dElementAccess {
    public static void main(String[] args) {

        // 2차원 배열의 요소 접근
        int[][] iArray2d = new int[][]
        {
            { 1, 2 },
            { 3 },
            { 4, 5, 6 },
            { 7, 8 }
        };

        // 한 번의 인덱스 연산으로 2차원 배열의 특정 요소가 참조하는 1차원 배열에 접근할 수 있다.
        // 2차원 배열의 0번째 요소에 저장된 참조를 iArray2dRow에 저장
        int[] iArray2dRow = iArray2d[0];
        for(int i = 0; i < iArray2dRow.length; ++i)
            System.out.print(iArray2dRow[i] + " ");      // 1, 2

        // 두 번의 인덱스 연산으로 2차원 배열의 특정 요소가 참조하는 1차원 배열의 요소에 접근할 수 있다.
        // 2차원 배열의 0번째 요소가 참조하는 배열의 1번째 요소의 값을 iArray2dElement에 저장
        int iArray2dElement = iArray2d[0][1];
        System.out.println(iArray2dElement);  // 2
        iArray2d[0][1] = 10;
        System.out.println(iArray2dElement);  // 10

    }
}

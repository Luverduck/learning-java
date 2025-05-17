package part_01.chapter_03.s03_07.t07_02;

public class Array2dAllocation1 {
    public static void main(String[] args) {

        // 2차원 배열에 참조 할당
        int[][] iArray2dOrigin = new int[][]
        {
            { 1, 1 },
            { 2 },
            { 3, 3, 3 }
        };
        int[][] iArray2dTemp = new int[][]
        {
            { 4, 4 },
            { 5 },
            { 6, 6, 6 }
        };

        // 2차원 배열 변수 iArray2dTemp의 0행에 iArray2dOrigin의 0행 참조를 저장
        iArray2dTemp[0] = iArray2dOrigin[0];
        for(int i = 0; i < iArray2dOrigin.length; ++i)
        {
            for(int j : iArray2dOrigin[i])
                System.out.printf("%d ".formatted(j));
            System.out.print("\n");
        }
        for(int i = 0; i < iArray2dTemp.length; ++i)
        {
            for(int j : iArray2dTemp[i])
                System.out.printf("%d ".formatted(j));
            System.out.print("\n");
        }

        // iArray2dTemp의 0행 0열의 값을 5로 변경
        iArray2dTemp[0][0] = 5;
        for(int i = 0; i < iArray2dOrigin.length; ++i)
        {
            for(int j : iArray2dOrigin[i])
                System.out.printf("%d ".formatted(j));
            System.out.print("\n");
        }
        for(int i = 0; i < iArray2dTemp.length; ++i)
        {
            for(int j : iArray2dTemp[i])
                System.out.printf("%d ".formatted(j));
            System.out.print("\n");
        }

        // iArray2dOrigin의 0행 1열의 값을 5로 변경
        iArray2dOrigin[0][1] = 5;
        for(int i = 0; i < iArray2dOrigin.length; ++i)
        {
            for(int j : iArray2dOrigin[i])
                System.out.printf("%d ".formatted(j));
            System.out.print("\n");
        }
        for(int i = 0; i < iArray2dTemp.length; ++i)
        {
            for(int j : iArray2dTemp[i])
                System.out.printf("%d ".formatted(j));
            System.out.print("\n");
        }

        // iArray2dTemp의 2행을 초기화
        iArray2dTemp[2] = new int[] { 8, 8, 8, 8 };
        for(int i = 0; i < iArray2dOrigin.length; ++i)
        {
            for(int j : iArray2dOrigin[i])
                System.out.printf("%d ".formatted(j));
            System.out.print("\n");
        }
        for(int i = 0; i < iArray2dTemp.length; ++i)
        {
            for(int j : iArray2dTemp[i])
                System.out.printf("%d ".formatted(j));
            System.out.print("\n");
        }

    }
}

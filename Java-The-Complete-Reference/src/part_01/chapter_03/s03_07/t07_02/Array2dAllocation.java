package part_01.chapter_03.s03_07.t07_02;

public class Array2dAllocation {
    public static void main(String[] args) {

        // 2차원 배열에 참조 할당
        int[][] iArray2dOrigin = new int[][]
        {
            { 1, 1 },
            { 2 },
            { 3, 3, 3 }
        };
        int[][] iArray2dTemp;

        // 2차원 배열 변수 iArray2dTemp에 iArray2dOrigin의 참조를 저장
        iArray2dTemp = iArray2dOrigin;
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

        // iArray2dTemp를 초기화
        iArray2dTemp = new int[][]
        {
            { 1, 1 },
            { 2 },
            { 3, 3, 3 }
        };
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

        // iArray2dTemp의 0행 1열 요소의 값을 10으로 변경
        iArray2dTemp[0][1] = 10;
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

        // iArray2dTemp의 2행 2열 요소의 값을 99로 변경
        iArray2dOrigin[2][2] = 99;
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

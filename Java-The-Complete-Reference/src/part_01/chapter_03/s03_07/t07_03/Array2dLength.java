package part_01.chapter_03.s03_07.t07_03;

public class Array2dLength {
    public static void main(String[] args) {

        // 2차원 배열의 길이
        int[][] iArray2d = new int[][]
        {
            { 1, 2 },
            { 3 },
            { 4, 5, 6 },
            { 7, 8 }
        };

        // 2차원 배열의 길이
        int length2d = iArray2d.length;     // 4 => { { 1, 2 }, { 3 }, { 4,5,6 }, { 7,8 } }

        // 2차원 배열의 0번째 요소의 길이
        int length2d0 = iArray2d[0].length; // 2 => { 1, 2 }

        // 2차원 배열의 1번째 요소의 길이
        int length2d1 = iArray2d[1].length; // 1 => { 3 }

        // 2차원 배열의 2번째 요소의 길이
        int length2d2 = iArray2d[2].length; // 3 => { 4, 5, 6 }

        // 2차원 배열의 3번째 요소의 길이
        int length2d3 = iArray2d[3].length; // 2 => { 7, 8 }
    }
}

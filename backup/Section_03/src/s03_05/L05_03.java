package s03_05;

/**
 * 2차원 배열의 길이
 * 2차원 배열의 length 속성은 배열의 주소를 저장하는 참조형 배열의 길이이며
 * 2차원 배열 요소에 저장된 주소의 1차원 배열들은 길이가 서로 다를 수 있다.
 */

public class L05_03 {
    public static void main(String[] args) {

        int[][]     arr2dInt    = new int[][]
        {
                { 1, 2, 3 },
                { 4, 5 },
                { 6, 7, 8, 9 }
        };

        // 2차원 배열의 길이
        int length2d    = arr2dInt.length;     // 결과 : 3

        // 2차원 배열의 0번째 요소에 저장된 배열의 길이 => { 1, 2, 3 }
        int length2d1st = arr2dInt[0].length;  // 결과 : 3

        // 2차원 배열의 1번째 요소에 저장된 배열의 길이 => { 4, 5 }
        int length2d2nd = arr2dInt[1].length;  // 결과 : 2

        // 2차원 배열의 2번째 요소에 저장된 배열의 길이 => { 6, 7, 8, 9 }
        int length2d3rd = arr2dInt[2].length;  // 결과 : 4
    }
}

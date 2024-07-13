package s03_05;

/**
 * 2차원 배열의 요소 접근
 * 2차원 배열은 인덱스 연산자 []를 통해 2차원 배열의 특정 요소에 접근할 수 있다.
 */

public class L05_04 {
    public static void main(String[] args) {
        // 2차원 배열의 요소 접근
        int[][]     arr2d    = new int[][]
        {
                { 1, 2, 3 },
                { 4, 5 },
                { 6, 7, 8, 9 }
        };

        // ✅ 한 번의 인덱스 연산을 통해 2차원 배열의 특정 행 배열에 접근할 수 있다.
        // 2차원 배열의 0번째 요소에 저장된 주소를 arr에 저장
        int[] arr = arr2d[0];
        // arr에 저장된 주소의 1차원 배열의 모든 요소 출력
        for(int i = 0; i < arr.length; ++i)
            System.out.print(i + " ");      // 결과 : 1 2 3

        // ✅ 두 번의 인덱스 연산을 통해 2차원 배열의 특정 요소에 접근할 수 있다.
        // 2차원 배열의 0번째 행 배열에서 1번째 요소에 접근
        int element = arr2d[0][1];
        System.out.println(element);        // 결과 : 2
        // 배열의 특정 요소에 접근한 후 대입 연산을 통해 해당 요소에 값을 저장할 수 있다.
        arr2d[0][1] = 10;
    }
}

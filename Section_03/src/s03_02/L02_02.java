package s03_02;

/**
 * 정수 오버플로우 (Integer overflow)
 * 산술 연산의 결과값이 자료형의 표현 범위를 초과할 경우 발생하는 현상
 * 결과값이 표현 범위의 최대값보다 큰 경우 최소값에서 초과한 값만큼 더한 값이 출력된다.
 * 결과값이 표현 범위가 최소값보다 작은 경우 최대값에서 초과한 값만큼 뺀 값이 출력된다.
 */

public class L02_02 {
    public static void main(String[] args) {
        // 정수 오버플로우
        byte _1b_byte;
        // 결과값이 표현 범위의 최대값보다 큰 경우
        _1b_byte = 127;
        _1b_byte++;
        System.out.println(_1b_byte);   // 결과 : -128

        // 결과값이 표현 범위가 최소값보다 작은 경우
        _1b_byte = -128;
        _1b_byte--;
        _1b_byte--;
        System.out.println(_1b_byte);   // 결과 : 126
    }
}

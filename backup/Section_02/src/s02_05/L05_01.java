package s02_05;

/**
 * 변수 (Variable)
 * 데이터를 저장하는 공간 (메모리)을 의미한다.
 * 특정 값을 여러 부분에서 공통적으로 사용할 때 그 값을 변수화하는 것이 유지보수하기 좋다.
 */

public class L05_01 {
    public static void main(String[] args) {

        // 예를 들어, 다음과 같이 원주율의 값 3.14를 공통적으로 사용하고 있는 코드가 있다.
        System.out.println("원주율: " + 3.14);
        System.out.println("원의 둘레: 지름 X " + 3.14);
        System.out.println("원의 넓이: 반지름의 제곱 X " + 3.14);
        System.out.println("구의 부피: 반지름의 세제곱 X 4/3 X " + 3.14);

        // 해당 코드에서 원주율을 소수점 3자리 값으로 교체한다고 할 때 4번의 수정을 거쳐야 한다.

        // 원주율을 변수화할 경우 변수의 값만 수정하여 해당 변수를 사용하는 모든 코드를 수정할 수 있다.
        double pi = 3.14;
        pi = 3.141;
        System.out.println("원주율: " + pi);
        System.out.println("원의 둘레: 지름 X " + pi);
        System.out.println("원의 넓이: 반지름의 제곱 X " + pi);
        System.out.println("구의 부피: 반지름의 세제곱 X 4/3 X " + pi);
    }
}

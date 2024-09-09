package s02_05;

/**
 * 상수 (Const)
 * 변수와 마찬가지로 데이터를 저장하는 공간(메모리)를 의미한다.
 * 하지만 변수와 달리 한 번 상수에 저장된 값은 변경할 수 없다.
 * 엄밀하게 말하면, 한 번만 값을 할당할 수 있는 메모리를 의미한다.
 */

public class L05_04 {
    public static void main(String[] args) {
        // 상수의 선언
        // 변수를 선언할 때 자료형 앞에 `final` 키워드를 붙여 변수를 상수화 할 수 있다.
        // 상수화 된 변수는 값을 재할당 할 수 없으므로 반드시 변수의 선언과 동시에 초기화해야 한다.
        final int INT_NUM = 1;
        //INT_NUM = 2;
        // Cannot assign a value to final variable 'INT_NUM'
    }
}

package s02_05;

/**
 * 변수 (Variable)
 * 데이터를 저장하는 공간 (메모리)을 의미한다.
 * 특정 값을 여러 부분에서 공통적으로 사용할 때 그 값을 변수화하는 것이 유지보수하기 좋다.
 */

public class L05_02 {
    public static void main(String[] args) {
        // 변수의 선언 (declaration)
        // 변수로 사용할 메모리를 할당받는 것을 의미한다.
        // 변수를 선언할 때 변수명 앞에 자료형을 명시해야 한다.
        int num;
        // Java에서 변수는 초기화하지 않으면 사용할 수 없다.
        //System.out.println(num);

        // 변수의 초기화 (initialize)
        // 변수에 값을 새로 저장하는 것을 의미한다.
        // 변수를 초기화할 때 대입 연산자 '='를 사용한다.
        num = 35;
        System.out.println(num);

        // 변수는 선언과 동시에 초기화 할 수 있다.
        int age = 20;
        boolean isMarried = false;
        double height = 179.99;
        char sex = 'M';
        String name = "홍길동";
    }
}

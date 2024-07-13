package s03_06;

/**
 * 자료형 추론 (Java 10+)
 * 변수 초기화 시 컴파일러가 초기화자(initializer)를 통해 해당 변수의 자료형을 추론하는 기능
 * 변수 초기화에서 자료형이 `var`인 변수는 자료형 추론의 대상이 된다.
 */

public class L06_02 {
    public static void main(String[] args) {
        // 자료형 추론의 특징
        // 1. 다음의 경우 자료형 추론을 사용할 수 없다.
        // i) 변수를 선언만 하는 경우
        var varShort;
        // ii) 변수를 null로 초기화하는 경우
        var varString = null;

        // 2. 자료형 추론을 통해 초기화된 변수에 다른 자료형의 리터럴을 대입할 수 없다.
        // 리터럴 1은 정수형이므로 var는 int형으로 추론된다.
        var varInt = 1;
        // int형으로 추론된 varInt에 double형 리터럴 3.5는 대입할 수 없다.
        varInt = 3.5;
    }
}

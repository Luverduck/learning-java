package s06_05;

/**
 * 메소드 오버로딩 (Method Overloading)
 * 동일한 이름의 메소드를 여러 개 정의하는 것
 * 오버로딩 된 메소드는 오직 매개변수의 자료형과 개수를 기준으로 구별된다.
 *
 * 메소드 시그니처(Method Signature)
 * 컴파일러가 메소드를 구별하는 기준
 * 컴파일러는 메소드명, 매개변수의 자료형과 개수를 기준으로 메소드를 구별한다.
 */

public class L05_01 {
    public static void main(String[] args) {
        // 오버로딩된 함수의 호출
        int call1 = func(1);
        int call2 = func(3.5);
        int call3 = func(1, 3.5);
    }
    
    // ⭐ 오버로딩된 메소드는 매개변수 리스트의 구성에 의해 구별된다.
    static int func(int i) { return i; };
    static int func(double d) { return (int)d; };
    static int func(int i, double d) { return (int)(i + d); };
}

package s07_02.L02_01;

/**
 * 인스턴스 멤버 (Instance Member)
 * 클래스 안에 'static' 키워드 없이 정의된 변수와 함수를 의미한다.
 * - 인스턴스 필드(Field)
 * - 인스턴스 메소드(Method)
 *
 * 인스턴스 필드 (Instance Field)
 * 클래스 안에 'static' 키워드 없이 정의된 변수(Variable)
 * 클래스로부터 생성된 객체의 상태를 저장한다.
 * 필드를 'final' 키워드로 선언하면 해당 필드는 값을 재 할당할 수 없다.
 *
 * 인스턴스 메소드 (Instance Method)
 * 클래스 안에 'static' 키워드 없이 정의된 함수(Function)
 * 클래스로부터 생성된 객체의 필드를 조작하거나 특정 기능을 수행한다.
 * 메소드 오버로딩(Method Overloading)을 통해 같은 이름의 메소드를 중복 정의할 수 있다.
 */

public class HYChicken {
    // ✅ 필드 (Field)
    final String    brand = "HY치킨";
    int             no;
    String          location;

    // ✅ 메소드 (Method)
    void intro() {
        System.out.printf("%s %d호 %s점 입니다.\n", brand, no, location);
    }
}
package s07_02.L02_01;

/**
 * ### 클래스 멤버 (Member)
 * 클래스의 멤버는 크게 2가지로 분류할 수 있다.
 * - 필드(Field)
 * - 메소드(Method)
 */

public class Person {
    // ✅ 필드(Field)
    // - 클래스 안에 정의된 변수(Variable)로, 객체의 상태를 저장한다.
    String          name;               // 변수
    int             age;
    // - 필드를 final 키워드로 선언하면 값을 재할당할 수 없도록 상수화된다.
    final String    species = "사람";  // 상수화된 변수

    // 메소드(Method)
    // - 클래스 안에 정의된 함수(Function)로, 클래스의 필드를 조작하거나 특정 기능을 수행한다.
    // - 메소드 오버로딩(Method Overloading)을 통해 같은 이름의 메소드를 중복 정의할 수 있다.
    void intro(String name) {
        System.out.println("이름 : " + name);
    }
    void intro(String name, int age) {
        System.out.println("이름 : " + name + ", 나이 : " + age);
    }
    void intro(String name, int age, String spacies) {
        System.out.println("이름 : " + name + ", 나이 : " + age + ", 종 : " + spacies);
    }
}

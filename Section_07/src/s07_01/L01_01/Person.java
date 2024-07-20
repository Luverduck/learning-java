package s07_01.L01_01;

/**
 * 클래스 (Class)
 * 클래스로부터 생성될 객체(Object)의 상태와 동작을 포함하는 사용자 정의 자료형
 */

// 클래스의 정의
// 클래스는 class 키워드를 이용하여 정의할 수 있다.
public class Person {
    // 클래스 안에는 필드(Field)와 메소드(Method)를 정의할 수 있다.
    // ✅ 필드(Field)
    // - 클래스 안에 정의된 변수(Variable)로, 객체의 상태를 저장한다.
    String name;
    int age;
    // ✅ 메소드(Method)
    // - 클래스 안에 정의된 함수(Function)로, 클래스의 필드를 조작하거나 특정 기능을 수행한다.
    void intro(String name, int age) {
        System.out.println("name : " + name + ", age : " + age);
    }
    // ✅ 생성자(Constructor)
    // - 클래스 안에 정의된 함수(Function) 중 하나로, 클래스로부터 객체를 생성할 때 호출된다.
    Person() {
        System.out.println("사람 생성");
    }
}

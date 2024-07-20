package s07_03.L03_03;

/**
 * this 키워드
 * 클래스의 인스턴스 자신을 가리키는 참조 변수를 의미한다.
 * `this` 키워드와 도트 연산자 '.'를 통해 인스턴스의 멤버에 접근할 수 있다.
 */

public class Person {
    // 필드(Field)
    String          name;               // 변수
    int             age;
    final String    species = "사람";    // 상수화된 변수

    // 메소드(Method)
    void intro() {
        System.out.println("종 : " + species);
    }
    void intro(String name) {
        System.out.println("종 : " + species + ", 이름 : " + name);
    }
    void intro(String name, int age) {
        System.out.println("종 : " + species + ", 이름 : " + name + ", 나이 : " + age);
    }

    // ✅ 생성자(Constructor)
    Person() {
        this.intro();
    }
    Person(String name) {
        this.name = name;
        this.intro(this.name);
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.intro(this.name, this.age);
    }
}

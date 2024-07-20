package s07_03.L03_01;

/**
 * 생성자 (Constructor)
 * 클래스 안에 정의된 함수(Function) 중 하나로, 클래스로부터 객체를 생성할 때 호출된다.
 * 생성자는 반환형을 명시하지 않으며 return 문이 없어도 해당 클래스 자료형의 인스턴스를 반환한다.
 * 생성자 오버로딩(Constructor Overloading)을 통해 여러 매개변수의 생성자를 중복 정의할 수 있다.
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
        System.out.println(species + " 생성");
    }
    Person(String name) {
        System.out.println(species + " " + name + " 생성");
    }
    Person(String name, int age) {
        System.out.println(species + " " + name + " " + age + "살" + " 생성");
    }
}

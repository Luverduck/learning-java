package s07_03.L03_03;

/**
 * this 키워드
 * 클래스의 인스턴스 자신을 가리키는 참조 변수를 의미한다.
 * `this` 키워드와 도트 연산자 '.'를 통해 인스턴스의 멤버에 접근할 수 있다.
 */

public class Main {
    public static void main(String[] args) {
        // 생성자 호출을 통한 객체 생성
        Person person1 = new Person();
        Person person2 = new Person("Sam");
        Person person3 = new Person("Sam", 25);
    }
}
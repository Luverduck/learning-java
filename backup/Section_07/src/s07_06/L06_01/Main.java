package s07_06.L06_01;

/**
 * 인스턴스의 멤버 접근
 * 클래스의 'public' 멤버는 클래스 밖에서도 접근할 수 있지만
 * 클래스의 'private' 멤버는 클래스 안의 멤버를 통해서만 접근할 수 없다.
 */

public class Main {
    public static void main(String[] args) {
        // Person 클래스의 인스턴스 생성
        Person person = new Person("Sam", 20, 175.6, 74.2);

        // ✅ public 멤버는 클래스 밖에서 접근 가능
        String name = person.name;

        // ❌ private 멤버는 클래스 밖에서 접근 불가능
        //int age = person.age;

        // ✅ private 멤버는 클래스 안의 멤버를 통해 접근 가능
        person.info();
    }
}

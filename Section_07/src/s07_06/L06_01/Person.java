package s07_06.L06_01;

/**
 * 접근 제한자 (Access Modifier)
 * 클래스 또는 클래스로부터 생성된 인스턴스의 멤버에 접근할 수 있는 범위를 제한하는 키워드
 *
 * 접근 제한자의 종류
 * 클래스 단위 접근 제한자는 다음과 같다.
 * - public     클래스 밖에서도 접근 가능
 * - private    클래스 안의 멤버를 통해서만 접근 가능
 */

public class Person {
    // ✅ 필드 (Field)
    public String name;
    private int age;
    private double height;
    private double weight;

    // ✅ 메소드 (Method)
    public void info() {
        System.out.println(name + " " + age + " " + height + " " + weight);
    }

    // 생성자 (Constructor)
    Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
}

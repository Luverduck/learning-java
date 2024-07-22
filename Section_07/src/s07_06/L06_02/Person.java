package s07_06.L06_02;

/**
 * ### Getter / Setter Method
 * 클래스 안에 정의된 필드에 접근하기 위해 정의하는 메소드
 * ⭐ Getter / Setter를 'public'으로 정의하여 클래스 밖에서 'private' 필드의 접근을 매개할 수 있다.
 */

public class Person {
    // 필드 (Field)
    public String name;
    private int age;
    private double height;
    private double weight;

    // 메소드 (Method)
    public void info() {
        System.out.println(name + " " + age + " " + height + " " + weight);
    }

    // ✅ Getter / Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    // 생성자 (Constructor)
    Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
}

package s07_03.L03_02;

/**
 * 클래스의 인스턴스화 (**instantiation)*
 * 객체의 생성은 'new' 키워드와 클래스의 생성자 호출을 통해 이루어진다.
 * 클래스로부터 객체를 생성하는 과정을 클래스의 인스턴스화(instantiation)라고 하며
 * 클래스의 인스턴스화로 생성된 객체를 클래스의 인스턴스(instance)라 한다.
 * - 클래스의 생성자가 정의되어있을 경우 오직 해당 생성자 호출을 통해 인스턴스를 생성할 수 있다.
 * - ✅ 클래스의 생성자가 정의되어있지 않을 경우 기본 생성자 호출을 통해 인스턴스를 생성한다.
 */

public class Main {
    public static void main(String[] args) {
        // ✅ 기본 생성자 호출을 통한 클래스의 인스턴스화
        HYChicken hyChicken = new HYChicken();
    }
}

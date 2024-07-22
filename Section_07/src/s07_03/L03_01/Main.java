package s07_03.L03_01;

/**
 * 클래스의 인스턴스화 (instantiation)
 * 객체의 생성은 'new' 키워드와 클래스의 생성자 호출을 통해 이루어진다.
 * 클래스로부터 객체를 생성하는 과정을 클래스의 인스턴스화(instantiation)라고 하며
 * 클래스의 인스턴스화로 생성된 객체를 클래스의 인스턴스(instance)라 한다.
 */

public class Main {
    public static void main(String[] args) {
        // 기본 생성자 호출
        HYChicken headQuarter   = new HYChicken();
        // 오버로딩된 생성자의 호출
        HYChicken chain1        = new HYChicken(1, "강남");
        HYChicken chain2        = new HYChicken(1, "잠실", 30000);
    }
}

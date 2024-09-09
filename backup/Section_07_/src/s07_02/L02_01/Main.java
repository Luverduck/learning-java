package s07_02.L02_01;

/**
 * 인스턴스 멤버의 접근
 * 인스턴스 멤버는 클래스의 인스턴스를 통해 접근할 수 있다.
 * 즉, 인스턴스 필드와 인스턴스 메소드는 클래스의 인스턴스에 속해있다.
 */

public class Main {
    public static void main(String[] args) {
        // HYChicken 클래스의 인스턴스 생성
        HYChicken hyChicken = new HYChicken();

        // ✅ 인스턴스 멤버의 접근
        hyChicken.no = 1;
        hyChicken.location = "강남";
        hyChicken.intro();
    }
}

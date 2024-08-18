package s10_01.L01_02;

public class Main {
    public static void main(String[] args) {
        // ✅ 열거 상수는 클래스 로딩 시점에 생성자 호출을 통해 인스턴스화 한다.
        // ✅ 열거 상수는 열거 클래스의 public static final 필드로, 인스턴스 생성 없이 접근할 수 있다.
        // ✅ 열거 상수는 열거 클래스의 멤버 외에도 선언한 이름(name)과 순서(ordinal)를 필드로 가진다.
        Medal gold = Medal.GOLD;
        Medal silver = Medal.GOLD;
        Medal bronze = Medal.GOLD;
    }
}

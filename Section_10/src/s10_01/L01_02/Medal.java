package s10_01.L01_02;

public enum Medal {
    // 열거 상수 (Enumeration Constant)
    // 열거 클래스의 'public static final' 필드로 선언된 열거 클래스의 인스턴스
    // 열거 상수는 클래스 로딩 시점에 생성자 호출을 통해 인스턴스화 한다.
    // 열거 상수는 열거 클래스의 멤버 외에도 선언한 이름(name)과 순서(ordinal)를 필드로 가진다.

    // ✅ 생성자 호출을 통한 열거 상수의 인스턴스화
    GOLD(30), SILVER(20), BRONZE(10);

    // ✅ 열거 클래스의 멤버
    // 필드 (Field)
    private int score;
    // 메소드 (Method)
    public void printScore() {
        System.out.println("점수 : %d".formatted(score));
    }

    // ✅ 열거 클래스의 생성자
    Medal(int score) {
        this.score = score;
    }
}

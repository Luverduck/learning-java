package part_01.chapter_12.s12_03.t03_02;

public class AutoBoxingUnboxingInMethodCall {
    public static void main(String[] args) {
        // 1. 기본 자료형의 값을 래퍼 클래스의 인스턴스로 자동 박싱
        Integer wIntBox = 100;
        // 2. 래퍼 클래스의 인스턴스를 인수로 전달하여 메소드 호출
        Integer wIntBoxReturn = iMethod(wIntBox);
        // 5. 반환한 기본 자료형의 값을 래퍼 클래스의 인스턴스로 자동 박싱
    }

    // 3. 인수로 전달된 래퍼 클래스의 인스턴스를 기본 자료형 값으로 자동 언박싱
    static Integer iMethod(int pIntParam) {
        // 4. 기본 자료형 값을 반환
        return pIntParam;
    }
}

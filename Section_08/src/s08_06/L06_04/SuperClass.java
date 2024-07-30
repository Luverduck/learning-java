package s08_06.L06_04;

/**
 * final 키워드
 * 대상의 속성이 변하지 않음을 정의할 때 사용하는 제한자(Modifier)
 * final 키워드가 적용되는 대상에 따라 다음과 같이 동작한다.
 * - 변수의 값 재할당 방지
 * - 메소드의 오버라이딩 방지
 * ✅ 클래스의 상속 방지
 */

// final 키워드로 선언되지 않은 클래스
public class SuperClass {
    // 필드
    String superName;
    // 메소드
    void print() {
        System.out.println("상위 클래스의 메소드");
    }
}
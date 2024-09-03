package s10_05.L05_02;

/**
 * 문자열 파싱 (Parsing)
 * 문자열을 논리값으로 분석한 값을 논리 원시 자료형으로 변환
 *
 * 문자열 파싱 후 박싱 (Parsing & Boxing)
 * 문자열을 파싱 후 논리형 래퍼 클래스의 인스턴스로 변환 (`parseInt` + `valueOf`)
 */

public class BooleanParsing {
    public static void main(String[] args) {
        // ✅ 문자열 파싱 (Parsing)
        boolean pBoolean = Boolean.parseBoolean("true");
        // - 문자열이 "true"일 때만 true를 반환한다.
        boolean pBooleanT = Boolean.parseBoolean("true");
        boolean pBooleanF = Boolean.parseBoolean("true1");

        // ✅ 문자열 파싱 후 박싱 (Parsing & Boxing)
        Boolean wBoolean = Boolean.valueOf("true");
        // - 문자열이 "true"일 때만 논리형 래퍼 클래스의 value에 true가 저장된다.
        Boolean wBooleanT = Boolean.valueOf("true");
        Boolean wBooleanF = Boolean.valueOf("true1");
    }
}

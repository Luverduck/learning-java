package part_01.chapter_12.s12_02.t02_04;

public class BooleanWrapper {
    public static void main(String[] args) {

        // 논리형 래퍼 클래스 (Boolean Wrapper Class)

        // 박싱 (Boxing)
        Boolean wBooleanBox = Boolean.valueOf(true);

        // 언박싱 (Unboxing)
        boolean pBooleanUnbox = wBooleanBox.booleanValue();

        // 문자열 파싱 (Parsing)
        boolean pBooleanParsT = Boolean.parseBoolean("true"); // 문자열이 "true"일 때만 true 반환
        boolean pBooleanParsF = Boolean.parseBoolean("true1");

        // 문자열 파싱 후 박싱 (Parsing & Boxing)
        Boolean wBooleanParsBox = Boolean.valueOf("true");

    }
}

package part_01.chapter_15.s15_06.t06_02;

public class MyClass {

    // ...

    // 메소드 (Method)
    // 인스턴스 메소드 (비정적 메소드)
    String vMethod(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; --i)
            sb.append(str.charAt(i));
        sb.append(" [인스턴스 메소드 참조]");
        return sb.toString();
    }

    // 클래스 메소드 (정적 메소드)
    static String vMethodStatic(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; --i)
            sb.append(str.charAt(i));
        sb.append(" [클래스 메소드 참조]");
        return sb.toString();
    }

}

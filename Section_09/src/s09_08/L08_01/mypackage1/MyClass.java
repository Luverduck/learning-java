package s09_08.L08_01.mypackage1;

public class MyClass {

    // 필드 (Field)
    public      String m_public     = "public";
    protected   String m_protected  = "protected";
                String m_default    = "(default)";
    private     String m_private    = "private";

    // 메소드(Method)
    void method() {
        // ✅ 같은 클래스에서 멤버간의 접근 제한
        // public 멤버 접근 ⭕
        System.out.println(this.m_public);
        // protected 멤버 접근 ⭕
        System.out.println(this.m_protected);
        // 접근 제한자가 없는 멤버 접근 ⭕
        System.out.println(this.m_default);
        // private 멤버 접근 ⭕
        System.out.println(this.m_private);
    }
}

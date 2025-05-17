package part_01.chapter_09.s09_02.t02_01.mypackage1;

public class MyClass {

    // 필드 (Field)
    public      String sFieldPublic     = "MyClass의 public 필드";
    protected   String sFieldProtected  = "MyClass의 protected 필드";
                String sFieldDefault    = "MyClass의 default 필드";
    private     String sFieldPrivate    = "MyClass의 private 필드";

    // 클래스 내부에서의 접근
    public void method() {
        // public 멤버    : 🟢
        System.out.println(sFieldPublic);
        // protected 멤버 : 🟢
        System.out.println(sFieldProtected);
        // default 멤버   : 🟢
        System.out.println(sFieldDefault);
        // private 멤버   : 🟢
        System.out.println(sFieldPrivate);
    }

}

package part_01.chapter_09.s09_02.t02_01.mypackage1;

public class MyClassSub extends MyClass {

    // 하위 클래스에서의 접근
    public void methodSub() {
        MyClass m = new MyClass();
        // public 멤버    : 🟢
        System.out.println(m.sFieldPublic);
        // protected 멤버 : 🟢
        System.out.println(m.sFieldProtected);
        // default 멤버   : 🟢
        System.out.println(m.sFieldDefault);
        // private 멤버   : ❌
        // System.out.println(m.sFieldPrivate);
    }

}

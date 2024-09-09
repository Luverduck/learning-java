package s09_08.L08_01.mypackage2;

import s09_08.L08_01.mypackage1.MyClass;

public class MyOuterClass {

    MyClass myClass;

    // 메소드(Method)
    void method() {
        // ✅ 다른 패키지의 일반 클래스에서 MyClass 클래스의 멤버 접근 제한
        // public 멤버 접근 ⭕
        System.out.println(myClass.m_public);
        // protected 멤버 접근 ❌
        // System.out.println(myClass.m_protected);
        // 접근 제한자가 없는 멤버 접근 ❌
        // System.out.println(myClass.m_default);
        // private 멤버 접근 ❌
        // System.out.println(myClass.m_private);
    }
}

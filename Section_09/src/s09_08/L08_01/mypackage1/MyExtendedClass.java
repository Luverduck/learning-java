package s09_08.L08_01.mypackage1;

public class MyExtendedClass extends MyClass {

    // 메소드(Method)
    @Override
    void method() {
        // ✅ 같은 패키지의 상속 클래스에서 MyClass 클래스의 멤버 접근 제한
        // public 멤버 접근 ⭕
        System.out.println(super.m_public);
        // protected 멤버 접근 ⭕
        System.out.println(super.m_protected);
        // 접근 제한자가 없는 멤버 접근 ⭕
        System.out.println(super.m_default);
        // private 멤버 접근 ❌
        // System.out.println(super.m_private);
    }
}

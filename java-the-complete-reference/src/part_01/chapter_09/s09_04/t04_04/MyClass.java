package part_01.chapter_09.s09_04.t04_04;

public class MyClass {

    // 클래스의 멤버로 선언된 중첩 인터페이스
    // public 멤버    : 🟢
    public interface NestedInterfacePublic {
        String sFieldInterfaceNested = "NestedInterfacePublic의 필드";
    }
    // protected 멤버 : 🟢
    protected interface NestedInterfaceProtected {
        String sFieldInterfaceNested = "NestedInterfaceProtected의 필드";
    }
    // default 멤버   : 🟢
    interface NestedInterfaceDefault {
        String sFieldInterfaceNested = "NestedInterfaceDefault의 필드";
    }
    // private 멤버   : 🟢
    private interface NestedInterfacePrivate {
        String sFieldInterfaceNested = "NestedInterfacePrivate의 필드";
    }

}

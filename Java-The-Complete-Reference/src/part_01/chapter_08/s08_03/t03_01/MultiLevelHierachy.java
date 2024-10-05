package part_01.chapter_08.s08_03.t03_01;

public class MultiLevelHierachy {
    public static void main(String[] args) {

        // 최하위 계층에 있는 클래스의 인스턴스 생성
        MyClassSub mSub = new MyClassSub();

        // MyClassSub 클래스의 멤버 접근
        System.out.println("%s 접근".formatted(mSub.sFieldSub));
        mSub.methodSub();

        // MyClass 클래스의 멤버 접근
        System.out.println("%s 접근".formatted(mSub.sField));
        mSub.method();

        // MyClassSuper 클래스의 멤버 접근
        System.out.println("%s 접근".formatted(mSub.sFieldSuper));
        mSub.methodSuper();

    }
}

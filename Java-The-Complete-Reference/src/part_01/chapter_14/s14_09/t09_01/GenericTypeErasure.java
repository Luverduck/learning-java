package part_01.chapter_14.s14_09.t09_01;

public class GenericTypeErasure {
    public static void main(String[] args) {

        // MyClassGeneric<Integer> 타입 인스턴스
        MyClassGeneric<Integer> mgi = new MyClassGeneric<>();

        // MyClassGeneric<String> 타입 인스턴스
        MyClassGeneric<String> mgs = new MyClassGeneric<>();

        // 런타임 중에 두 인스턴스는 타입 소거에 의해 MyClassGeneric 타입이 된다.
        System.out.println(mgi.getClass());
        System.out.println(mgs.getClass());
        System.out.println(mgi.getClass().equals(mgs.getClass()));

    }
}

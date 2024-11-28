package part_01.chapter_14.s14_13.t13_04;

public class CreatingGenericArray {
    public static void main(String[] args) {

        // 특정 타입의 제네릭 타입 배열을 선언할 수 있으나 인스턴스 생성 불가능
        // MyClassGeneric<Integer>[] mcgArrInteger = new MyClassGeneric<Integer>[10];

        // 와일드카드 제네릭 타입 배열은 선언과 인스턴스 생성 가능
        MyClassGeneric<?>[] mcgArrWildcard = new MyClassGeneric<?>[10];

    }
}

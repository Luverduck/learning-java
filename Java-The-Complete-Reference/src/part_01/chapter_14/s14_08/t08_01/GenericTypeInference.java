package part_01.chapter_14.s14_08.t08_01;

public class GenericTypeInference {
    public static void main(String[] args) {

        // 제네릭 타입의 인스턴스 생성
        MyClassGeneric<Integer, String> mg2 = new MyClassGeneric<Integer, String>();

        // 제네릭 타입의 인스턴스 생성 시 타입 추론
        MyClassGeneric<Integer, String> mg1 = new MyClassGeneric<>();

    }
}

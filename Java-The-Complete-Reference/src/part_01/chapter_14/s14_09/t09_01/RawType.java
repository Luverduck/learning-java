package part_01.chapter_14.s14_09.t09_01;

public class RawType {
    public static void main(String[] args) {

        // 일반 제네릭 타입은 컴파일 타임에 타입 검사를 수행한다.
        /*MyClassGeneric<Integer> mgI = new MyClassGeneric<>(100);
        System.out.println( (String)mgI.method() );*/

        // 로우 타입은 컴파일 타임에 타입 검사를 수행하지 않는다.
        MyClassGeneric mgR = new MyClassGeneric<Integer>(100);
        System.out.println( (String)mgR.method() );

    }
}

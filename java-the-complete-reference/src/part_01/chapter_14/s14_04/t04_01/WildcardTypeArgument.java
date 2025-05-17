package part_01.chapter_14.s14_04.t04_01;

public class WildcardTypeArgument {
    public static void main(String[] args) {

        MyClassGeneric<Object> mgO = new MyClassGeneric<Object>();
        MyClassGeneric<Number> mgn = new MyClassGeneric<Number>();
        MyClassGeneric<Integer> mgI = new MyClassGeneric<Integer>();

        // 무제한 와일드카드 타입 인수로 정의된 제네릭 타입 참조 변수
        // 타입 인수를 모든 타입에 대해 허용한다.
        MyClassGeneric<?> mgW;
        mgW = mgO;
        mgW = mgn;
        mgW = mgI;

        // 상한 경계 와일드카드 타입 인수로 정의된 제네릭 타입 참조 변수
        // 타입 인수를 Number 또는 그 하위 타입으로 제한한다.
        MyClassGeneric<? extends Number> mgWU;
//      mgWU = mgO; // Number보다 상위 타입인 Object를 타입 인수로 하는 제네릭 타입을 가리킬 수 없다.
        mgWU = mgn;
        mgWU = mgI;

        // 하한 경계 와일드카드 타입 인수로 정의된 제네릭 타입 참조 변수
        // 타입 인수를 Number 또는 그 상위 타입으로 제한한다.
        MyClassGeneric<? super Number> mgWL;
        mgWL = mgO;
        mgWL = mgn;
//      mgWL = mgI; // Number보다 하위 타입인 Integer인 타입 인수로 하는 제네릭 타입을 가리킬 수 없다.

    }
}

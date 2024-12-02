package part_01.chapter_15.s15_07.t07_02;

public class GenericConstructorReference {
    public static void main(String[] args) {

        // 함수형 인터페이스 타입 변수로 MyClassGeneric<T>의 생성자 참조
        MyFunctionGeneric<Integer> funcRefGenericConstructor = MyClassGeneric::new;
        // MyFunction<Integer> funcRefGenericConstructor = MyClassGeneric<Integer>::new; // 타입 추론 가능

        // 참조한 MyClassGeneric<T>의 생성자를 실행하여 MyClassGeneric<T>의 인스턴스 생성
        MyClassGeneric<Integer> myClassGeneric = funcRefGenericConstructor.execute();

    }
}

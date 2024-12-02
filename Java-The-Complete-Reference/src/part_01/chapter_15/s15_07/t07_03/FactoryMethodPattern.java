package part_01.chapter_15.s15_07.t07_03;

public class FactoryMethodPattern {

    // 팩토리 메소드 (Factory Method) : 인수로 전달한 생성자 타입의 객체를 생성하는 메소드
    static <R, T> R myClassFactory(MyFunctionGeneric<R, T> func, T value) {
        return func.execute(value);
    }

    public static void main(String[] args) {

        // 함수형 인터페이스 타입 변수로 MyClass의 생성자 참조
        MyFunctionGeneric<MyClass, String> funcRefConstructor = MyClass::new;
        // 참조한 생성자를 인수로 팩토리 메소드를 호출하여 MyClass의 인스턴스 생성
        MyClass myClass = myClassFactory(funcRefConstructor, "Hello!");
        // 인스턴스 필드의 값 출력
        System.out.println("myClass의 Field : " + myClass.getValue());

        // 함수형 인터페이스 타입 변수로 MyClassGeneric<T>의 생성자 참조
        MyFunctionGeneric<MyClassGeneric<Double>, Double> funcRefGenericConstructor = MyClassGeneric::new;
        // 참조한 생성자를 인수로 팩토리 메소드를 호출하여 MyClassGeneric<T>의 인스턴스 생성
        MyClassGeneric<Double> myClassGeneric = myClassFactory(funcRefGenericConstructor, 10.5);
        // 인스턴스 필드의 값 출력
        System.out.println("myClassGeneric의 Field : " + myClassGeneric.getValue());

    }
}

package part_01.chapter_15.s15_06.t06_03;

public class InstanceGenericMethodReference {

    // 인수로 전달받은 람다 표현식을 실행시키는 메소드
    static <T> int functionExecute(MyFunction<T> func, T[] values, T target) {
        return func.execute(values, target);
    }

    public static void main(String[] args) {

        int count;
        int target = 3;
        Integer[] values = { 1, 2, 3, 3, 4, 4, 2, 4, 3 };

        // 제네릭 함수형 인터페이스 타입 변수로 MyClass의 인스턴스 제네릭 메소드 참조
        MyClass myClass = new MyClass();
        //MyFunction<Integer> func = myClass::<Integer>countingValue;
        MyFunction<Integer> func = myClass::countingValue; // 타입 추론

        // 참조한 MyClass의 인스턴스 제네릭 메소드 실행
        count = functionExecute(func, values, target);

        // 결과 출력
        System.out.println("MyClass의 인스턴스 제네릭 메소드 참조");
        System.out.printf("count of %d : %d", target, count);

    }

}

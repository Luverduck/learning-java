package part_01.chapter_15.s15_06.t06_02;

public class ClassMethodReference {

    // 인수로 전달받은 람다 표현식을 실행시키는 메소드
    static String functionExecute(MyFunction func, String str) {
        return func.execute(str);
    }

    public static void main(String[] args) {

        String input = "Hello, World!";
        String output;

        // 함수형 인터페이스 타입 변수로 MyClass의 클래스 메소드 참조
        MyFunction funcRefStaticMethod = MyClass::vMethodStatic;

        // 참조한 MyClass의 클래스 메소드 실행
        output = functionExecute(funcRefStaticMethod, input);

        // 결과 출력
        System.out.println("input : " + input);
        System.out.println("output : " + output);

    }

}
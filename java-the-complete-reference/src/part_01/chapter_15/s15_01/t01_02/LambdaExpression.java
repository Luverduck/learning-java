package part_01.chapter_15.s15_01.t01_02;

public class LambdaExpression {
    public static void main(String[] args) {

        // 단일 람다 표현식
        MyFunction printHello = () -> System.out.println("Hello");

        // 블록 람다 표현식
        MyFunction printWorld = () -> {
            String res = "World";
            System.out.println(res);
        };

        // 함수형 인터페이스의 추상 메소드 호출
        printHello.execute();
        printWorld.execute();

    }
}
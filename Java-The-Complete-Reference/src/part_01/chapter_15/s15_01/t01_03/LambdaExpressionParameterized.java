package part_01.chapter_15.s15_01.t01_03;

public class LambdaExpressionParameterized {
    public static void main(String[] args) {

        // 단일 람다 표현식
        MyFunction customSumation = (x, y) -> x + y + 100;

        // 블록 람다 표현식
        MyFunction customMultiply = (x, y) -> {
            int res = x * y * 100;
            return res;
        };

        // 함수형 인터페이스의 추상 메소드 호출
        System.out.println( customSumation.execute(1, 2) );
        System.out.println( customMultiply.execute(3, 4) );

    }
}
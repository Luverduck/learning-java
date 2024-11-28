package part_01.chapter_15.s15_02.t02_01;

public class LambdaExpressionWithGeneric {
    public static void main(String[] args) {

        // String 타입에 대한 람다 표현식 : 문자열 뒤집기
        MyFunctionGeneric<String> reverse = (str) -> {
            StringBuilder sb = new StringBuilder();
            for(int i = str.length() - 1; i >= 0; --i)
                sb.append(str.charAt(i));
            return sb.toString();
        };
        System.out.println("Lambda reversed is " + reverse.execute("Lambda"));

        // Integer 타입에 대한 람다 표현식 : 팩토리얼
        MyFunctionGeneric<Integer> factorial = (n) -> {
            int res = 1;
            for(int i = 1; i <= n; ++i)
                res *= i;
            return res;
        };
        System.out.println("The factorial of 3 is " + factorial.execute(3));

    }
}

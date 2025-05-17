package part_01.chapter_15.s15_03.t03_01;

public class PassingLambdaExpressionAsArguments {

    // 인수로 전달받은 람다 표현식을 실행시키는 메소드
    static String functionExecute(MyFunction func, String str) {
        return func.execute(str);
    }

    public static void main(String[] args) {
        
        String input = "Hello, World!";
        String output;

        // 메소드 호출
        output = functionExecute(
            // 첫 번째 인수 : MyFunction 타입 람다 표현식
            (str) -> {
                StringBuilder sb = new StringBuilder();
                for(int i = str.length() - 1; i >= 0; --i)
                    sb.append(str.charAt(i));
                return sb.toString();
            },
            // 두 번째 인수 : String 타입
            input
        );

        // 메소드 호출 결과 출력
        System.out.println(output);

    }
}

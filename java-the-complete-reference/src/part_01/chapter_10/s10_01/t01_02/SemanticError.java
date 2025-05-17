package part_01.chapter_10.s10_01.t01_02;

public class SemanticError {
    public static void main(String[] args) {

        // 의미 오류 (Semantic Error)

        // 정적 의미 오류 (Static Semantic Error)
        // 1) 초기화되지 않은 변수의 사용
        int i;
        //i++;                         // 초기화되지 않은 변수의 사용

        // 2) 호환되지 않는 타입
        //int a = "Hello";             // int형에 String형 리터럴을 대입할 수 없다.

        // 3) 표현식의 오류
        String s = "Hello";
        //int a = 5 - s;                // - 연산자는 String에 대한 연산을 지원하지 않는다.

        // 4) 알 수 없는 참조
        //Strin strin = "Hello";        // 정의되지 않은 클래스(Strin)의 참조
        //system.out.println("Hello");  // 정의되지 않은 클래스(system)의 참조
        String str;
        //str.println("Hello");         // 클래스(String)에 정의되지 않은 메소드의 참조

        // 동적 의미 오류 (Dynamic Semantic Error)
        // 1) 배열의 인덱스 범위 초과
        int arr[] = new int[10];
        arr[10] = 100;                // 배열의 범위를 벗어난 요소의 접근

    }
}

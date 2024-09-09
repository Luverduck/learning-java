package s02_03;

/**
 * 주석 (Comment)
 * 주석이란 소스 코드 내 작성된 메모를 의미한다.
 * 파일 단계에서 무시되므로 프로그램 실행에 영향을 주지 않는다.
 */

public class Comment01 {
    public static void main(String[] args) {

        // 주석의 목적
        // 1) 소스 코드에 대한 설명
        // Hello World를 출력
        System.out.println("Hello, World!");

        // 2) 소스 코드의 비활성화
        System.out.println("Hello, World!");
        // System.out.println("Hello, Java!");

    }

    // 문서화 (JavaDoc)
    /**
     * 두 정수를 받아 그 합을 출력하는 함수
     * @param x
     * @param y
     * @return x + y
     */
    public int plus(int x, int y) {
        return x + y;
    };
}

package s02_03;

/**
 * 주석 (Comment)
 * 주석이란 소스 코드 내 작성된 메모를 의미한다.
 * 파일 단계에서 무시되므로 프로그램 실행에 영향을 주지 않는다.
 */

public class Comment02 {
    public static void main(String[] args) {

        // 주석의 종류
        // 1) 한 줄 주석
        // System.out.println("Hello, World!");

        // 2) 여러 줄 주석 (범위 주석)
        /*
            System.out.println("Hello, World!");
            System.out.println("Hello, Java!");
        */
    }

    // 3) 문서화 주석
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

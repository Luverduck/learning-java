package part_01.chapter_10.s10_08.t08_01;

public class ThrowCustomException {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        try {
            throw new CustomException("사용자 정의 예외 발생");
        } catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("프로그램 종료");
    }
}

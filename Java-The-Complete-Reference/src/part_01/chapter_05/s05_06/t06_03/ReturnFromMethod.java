package part_01.chapter_05.s05_06.t06_03;

public class ReturnFromMethod {

    static void method(int i) {
        System.out.println("실행 흐름을 메소드로 이동");
        System.out.println(i);
        if(i == 10)
        {
            System.out.println("실행 흐름을 메소드 호출부로 이동");
            return;
        }
        System.out.println(i + 1);
    }

    public static void main(String[] args) {

        System.out.println("프로그램 시작");
        int n = 10;
        method(n);
        System.out.println("프로그램 종료");

    }
}

package part_01.chapter_11.s11_03.t03_03;

public class MyThreadStart {
    public static void main(String[] args) {

        // 스레드 클래스의 인스턴스 생성
        Thread myThreadImplements = new Thread(new MyThreadImplements());
        Thread myThreadExtends = new MyThreadExtends();

        // 스레드 생성
        myThreadImplements.start();
        myThreadExtends.start();

    }
}
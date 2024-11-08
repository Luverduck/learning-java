package part_01.chapter_11.s11_03.t03_04;

public class MyThreadInformation {
    public static void main(String[] args) {

        // 스레드 클래스의 인스턴스 생성
        Thread myThread = new Thread(new MyThread());

        // 스레드 이름 설정
        myThread.setName("myThread");

        // 스레드 생성
        myThread.start();

    }
}

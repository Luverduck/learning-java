package part_01.chapter_11.s11_04.t04_01;

public class MyThread implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 5; ++i)
        {
            System.out.println("[%s] : %d".formatted(Thread.currentThread().getName(), i));
            
            // 매 번 출력 후 1초동안 스레드 일시 중지
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

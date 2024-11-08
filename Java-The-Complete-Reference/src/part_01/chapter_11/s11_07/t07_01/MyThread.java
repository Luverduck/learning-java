package part_01.chapter_11.s11_07.t07_01;

public class MyThread implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 10; ++i)
        {
            System.out.println("[%s] : %d".formatted(Thread.currentThread().getName(), i));
            
            // 매 번 출력 후 1초동안 스레드 일시 중지
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

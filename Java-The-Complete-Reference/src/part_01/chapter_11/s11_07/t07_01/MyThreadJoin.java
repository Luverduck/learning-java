package part_01.chapter_11.s11_07.t07_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyThreadJoin {
    public static void main(String[] args) {

        // 스레드 클래스의 인스턴스 생성
        Thread myThread = new Thread(new MyThread());

        // 스레드 이름 설정
        myThread.setName("myThread");

        // 스레드 생성
        myThread.start();

        // 스레드 실행 상태 확인
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("사용자 입력 시작");
            String input;
            while(true) {
                input = br.readLine();
                if(input.equals("join")) {
                    myThread.join();
                }
                System.out.println("입력 : " + input);
                if(input.equals("quit")) {
                    System.out.println("사용자 입력 종료");
                    break;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

package part_01.chapter_13.s13_02.t02_03;

import java.io.InputStream;
import java.io.PrintStream;

public class StandardStream {
    public static void main(String[] args) {

        // 바이트 입력 스트림을 표준 입력 스트림으로 초기화
        InputStream is = System.in;
        // 바이트 출력 스트림을 표준 출력 스트림으로 초기화
        PrintStream os = System.out;

        try {
            // 바이트 입력 스트림의 입력 버퍼에 저장된 데이터를 바이트 단위로 읽기
            int readByte;
            while( (readByte = is.read()) != -1 ) {
                // 읽은 데이터를 바이트 출력 스트림의 출력 버퍼에 쓰기
                os.write(readByte); // 출력 버퍼 자동 비우기 (autoFlush)
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
}

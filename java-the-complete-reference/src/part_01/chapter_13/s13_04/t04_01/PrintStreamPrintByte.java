package part_01.chapter_13.s13_04.t04_01;

import java.io.*;

public class PrintStreamPrintByte {
    public static void main(String[] args) {

        // 바이트 입력 스트림 초기화
        BufferedInputStream bis = new BufferedInputStream(System.in);
        // 바이트 출력 스트림 초기화
        PrintStream ps = new PrintStream(new BufferedOutputStream(System.out));

        try {
            // 바이트 입력 스트림의 입력 버퍼에 저장된 데이터를 바이트 단위로 읽기
            int readByte;
            while( (readByte = bis.read()) != -1 ) {
                // 읽은 데이터를 바이트 출력 스트림의 출력 버퍼에 쓰기
                ps.print(readByte);
            }
            // 출력 버퍼 비우기
            ps.flush();
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
}

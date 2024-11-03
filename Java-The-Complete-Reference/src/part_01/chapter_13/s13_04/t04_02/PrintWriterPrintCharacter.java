package part_01.chapter_13.s13_04.t04_02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class PrintWriterPrintCharacter {
    public static void main(String[] args) {

        // 문자 입력 스트림 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 문자 출력 스트림 초기화
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        try {
            // 문자 입력 스트림의 입력 버퍼에 저장된 데이터를 문자 단위로 읽기
            int readByte;
            while( (readByte = br.read()) != -1 ) {
                // 읽은 데이터를 문자 출력 스트림의 출력 버퍼에 쓰기
                pw.print((char)readByte);
            }
            // 출력 버퍼 비우기
            pw.flush();
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
}

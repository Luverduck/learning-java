package part_01.chapter_13.s13_04.t04_04;

import java.io.*;

public class PrintWriterPrintln {
    public static void main(String[] args) {

        // 문자 입력 스트림 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 문자 출력 스트림 초기화
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        try {
            // 문자 입력 스트림의 입력 버퍼에 저장된 데이터를 문자열 단위로 읽기
            String readLine;
            while( (readLine = br.readLine()) != null ) {
                // 읽은 데이터를 문자 출력 스트림의 출력 버퍼에 쓰기
                pw.println(readLine);
            }
            // 출력 버퍼 비우기
            pw.flush();
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
}

package part_01.chapter_13.s13_06.t06_01;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CharacterStreamReadingFile {
    public static void main(String[] args) {

        // 입력으로 읽기 할 파일의 경로
        String filePathRead = "Java-The-Complete-Reference\\src\\part_01\\chapter_13\\s13_06\\input.txt";

        // 문자 입력 스트림 초기화
        FileReader fr = null;
        // 문자 출력 스트림 초기화
        BufferedWriter bw = null;

        try {
            // 문자 입력 스트림 초기화
            fr = new FileReader(filePathRead);
            // 문자 출력 스트림 초기화
            bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));

            // 문자 입력 스트림의 입력 버퍼에 저장된 데이터를 문자 단위로 읽기
            int readByte;
            while( (readByte = fr.read()) != -1 ) {
                // 읽은 데이터를 문자 출력 스트림의 출력 버퍼에 쓰기
                bw.write(readByte);
                // 출력 버퍼 비우기
                bw.flush();
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
}

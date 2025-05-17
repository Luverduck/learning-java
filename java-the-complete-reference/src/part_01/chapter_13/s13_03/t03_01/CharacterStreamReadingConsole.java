package part_01.chapter_13.s13_03.t03_01;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterStreamReadingConsole {
    public static void main(String[] args) {

        // 문자 입력 스트림 초기화
        Reader r = new InputStreamReader(System.in);
        // 문자 출력 스트림 초기화
        Writer w = new OutputStreamWriter(System.out);

        try {
            // 문자 입력 스트림의 입력 버퍼에 저장된 데이터를 문자 단위로 읽기
            int readByte;
            while( (readByte = r.read()) != -1 ) {
                // 읽은 데이터를 문자 출력 스트림의 출력 버퍼에 저장
                w.write(readByte);
                // 출력 버퍼 비우기
                w.flush();
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
}

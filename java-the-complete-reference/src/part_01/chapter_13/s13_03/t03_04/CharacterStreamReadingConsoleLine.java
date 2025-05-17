package part_01.chapter_13.s13_03.t03_04;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CharacterStreamReadingConsoleLine {
    public static void main(String[] args) {

        // 문자 입력 스트림 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 문자 출력 스트림 초기화
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            // 문자 입력 스트림의 입력 버퍼에 저장된 데이터를 문자 단위로 읽기
            String readLine;
            while( (readLine = br.readLine()) != null ) {
                // 읽은 데이터를 문자 출력 스트림의 출력 버퍼에 저장
                bw.write(readLine);
            }
            // 출력 버퍼 비우기
            bw.flush();
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
}

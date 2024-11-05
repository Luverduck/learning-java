package part_01.chapter_13.s13_07.t07_01;

import java.io.*;

public class ByteStreamAutoClose {
    public static void main(String[] args) {

        // 입력으로 읽기 할 파일의 경로
        String filePathRead = "Java-The-Complete-Reference\\src\\part_01\\chapter_13\\s13_05\\input.txt";
        // 출력으로 쓰기 할 파일의 경로
        String filePathWrite = "Java-The-Complete-Reference\\src\\part_01\\chapter_13\\s13_05\\output.txt";

        try(
                // 바이트 입력 스트림 초기화
                FileInputStream fis = new FileInputStream(filePathRead);
                // 바이트 출력 스트림 초기화
                FileOutputStream fos = new FileOutputStream(filePathWrite);
            ) {
            // 바이트 입력 스트림의 입력 버퍼에 저장된 데이터를 바이트 단위로 읽기
            int readByte;
            while( (readByte = fis.read()) != -1 ) {
                // 읽은 데이터를 바이트 출력 스트림의 출력 버퍼에 쓰기
                fos.write(readByte);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
}

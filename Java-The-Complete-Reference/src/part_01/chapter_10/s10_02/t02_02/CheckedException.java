package part_01.chapter_10.s10_02.t02_02;

import java.io.*;

public class CheckedException {
    public static void main(String[] args) {

        // Exception 클래스
        // 검사 예외 (Checked Exception)
        try {
            System.setIn(new FileInputStream("test.txt"));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        }
        catch(Exception e) {
            System.out.println(e.toString());
            // java.io.FileNotFoundException: test.txt (지정된 파일을 찾을 수 없습니다)
        }

    }
}

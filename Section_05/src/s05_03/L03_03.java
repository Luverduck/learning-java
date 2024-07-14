package s05_03;

/**
 * switch 문의 흐름 제어
 * switch 문은 표현식 결과와 일치하는 case 라벨을 찾아 해당 라벨 이후의 문장을 실행한다.
 * switch 문의 특정 case 라벨에서 문장 실행 중 break 문을 만나면 switch 문을 벗어난다.
 */

public class L03_03 {
    public static void main(String[] args) {
        // ✅ switch 문의 흐름 제어
        int month = 4;
        switch(month) {
            case 1:
            case 2:
            case 3:
                System.out.println("1분기");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("2분기");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("3분기");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("4분기");
                break;
            default :
                System.out.println("분기 출력 끝");
        }
    }
}

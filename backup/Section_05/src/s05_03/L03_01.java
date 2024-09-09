package s05_03;

/**
 * switch 문
 * switch 문의 표현식 결과와 일치하는 case 라벨을 찾아 해당 라벨 이후의 문장을 실행한다.
 * default 라벨은 표현식 결과와 일치하는 case 라벨이 없을 경우 실행할 문장의 라벨을 의미한다.
 * ⭐ switch 문의 표현식 결과와 같은 case 라벨에 대한 선택 (다중 분기)
 */

public class L03_01 {
    public static void main(String[] args) {
        // ✅ switch 문
        int month = 3;
        switch(month) {
            case 1:
                System.out.println("1월");
            case 2:
                System.out.println("2월");
            case 3:
                System.out.println("3월");
            case 4:
                System.out.println("4월");
            case 5:
                System.out.println("5월");
            case 6:
                System.out.println("6월");
            case 7:
                System.out.println("7월");
            case 8:
                System.out.println("8월");
            case 9:
                System.out.println("9월");
            case 10:
                System.out.println("10월");
            case 11:
                System.out.println("11월");
            case 12:
                System.out.println("12월"); 
            default :
                System.out.println("월 출력 끝");
        }
    }
}

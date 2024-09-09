package s05_03;

/**
 * switch 문
 * switch 문의 표현식 결과와 일치하는 case 라벨을 찾아 해당 라벨 이후의 문장을 실행한다.
 * default 라벨은 표현식 결과와 일치하는 case 라벨이 없을 경우 실행할 문장의 라벨을 의미한다.
 * ⭐ switch 문의 표현식 결과와 같은 case 라벨에 대한 선택 (다중 분기)
 */

public class L03_02 {
    public static void main(String[] args) {
        // ✅ switch 문 (다중 case 라벨)
        // 여러 case 라벨에서 동일한 문장을 실행하도록 할 수 있다.
        int month = 4;
        switch(month) {
            case 1:
            case 2:
            case 3:
                System.out.println("1분기");
            case 4:
            case 5:
            case 6:
                System.out.println("2분기");
            case 7:
            case 8:
            case 9:
                System.out.println("3분기");
            case 10:
            case 11:
            case 12:
                System.out.println("4분기");
            default :
                System.out.println("분기 출력 끝");
        }
    }
}

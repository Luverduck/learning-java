package part_01.chapter_05.s05_03.t03_05;

public class StringCaseLabel {
    public static void main(String[] args) {

        // 문자열의 case문 매칭
        String str = "Two";

        switch(str)
        {
            case "One":
                System.out.println("A");
                break;
            case "Two":
                System.out.println("B");
                break;
            case "Three":
                System.out.println("C");
                break;
            default:
                System.out.println("X");
                break;
        }

    }
}

package part_01.chapter_04.s04_09.t09_02;

public class ArithmeticAssignmentOperator {
    public static void main(String[] args) {

        // 산술 대입 연산자(Arithmetic Assignment Operator)
        int x = 1;
        x += 10;
        System.out.println( "x += 10 : " + x );
        x -= 10;
        System.out.println( "x -= 10 : " + x );
        x *= 5;
        System.out.println( "x *= 10 : " + x );
        x /= 5;
        System.out.println( "x /= 10 : " + x );
        x %= 5;
        System.out.println( "x %= 10 : " + x );

    }
}

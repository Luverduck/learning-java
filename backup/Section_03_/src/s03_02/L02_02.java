package s03_02;

/**
 * 정수형 (Integer type)
 * 정수를 다루는 자료형
 * 부호가 있는(signed) 자료형만 존재한다.
 */

public class L02_02 {
    public static void main(String[] args) {
        // 1) byte      1[byte]     -128 ~ 127
        byte _1b_byte;
        _1b_byte    = Byte.MIN_VALUE;
        _1b_byte    = Byte.MAX_VALUE;

        // 2) short     2[byte]     -32,768 ~ 32,767
        short _2b_short;
        _2b_short   = Short.MIN_VALUE;
        _2b_short   = Short.MAX_VALUE;

        // 3) int       4[byte]     -2,147,483,648 ~ 2,147,483,647
        int _4b_int;
        _4b_int     = Integer.MIN_VALUE;
        _4b_int     = Integer.MAX_VALUE;

        // 4) long      8[byte]     -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long _8b_long;
        _8b_long    = Long.MAX_VALUE;
        _8b_long    = Long.MIN_VALUE;
    }
}

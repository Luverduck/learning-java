package s10_03.L03_03;

public class Main {
    public static void main(String[] args) {
        // 원시 자료형
        // 정수형
        byte p_byte         = 123;
        short p_short       = 123;
        int p_int           = 123;
        long p_long         = 123L;
        // 부동소수점형
        float p_float       = 1.23f;
        double p_double     = 1.23;
        // 논리형
        boolean p_boolean   = true;
        // 문자형
        char p_char         = 'A';

        // ✅ 원시 자료형의 박싱
        // 정수형
        Byte b_byte         = Byte.valueOf(p_byte);
        Short b_short       = Short.valueOf(p_short);
        Integer b_int       = Integer.valueOf(p_int);
        Long b_long         = Long.valueOf(p_long);
        // 부동소수점형
        Float b_float       = Float.valueOf(p_float);
        Double b_double     = Double.valueOf(p_double);
        // 논리형
        Boolean b_boolean   = Boolean.valueOf(p_boolean);
        // 문자형
        Character b_char    = Character.valueOf(p_char);

        // ✅ 래퍼 클래스 인스턴스의 언박싱
        // 정수형
        byte ub_byte        = b_byte.byteValue();
        short ub_short      = b_short.shortValue();
        int ub_int          = b_int.intValue();
        long ub_long        = b_long.longValue();
        // 부동소수점형
        float ub_float      = b_float.floatValue();
        double ub_double    = b_double.doubleValue();
        // 논리형
        boolean ub_boolean  = b_boolean.booleanValue();
        // 문자형
        char ub_char        = b_char.charValue();
    }
}

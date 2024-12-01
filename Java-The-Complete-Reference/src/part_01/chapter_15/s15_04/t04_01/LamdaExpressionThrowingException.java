package part_01.chapter_15.s15_04.t04_01;

public class LamdaExpressionThrowingException {
    public static void main(String[] args) {

        // 평균을 계산하는 람다 표현식
        MyFunction average = (nums) -> {
            // 배열의 길이가 0일 경우 EmptyArrayException 예외 던지기
            if(nums.length == 0)
                throw new CustomArrayException();
            double sum = 0;
            for(int i = 0; i < nums.length; ++i)
                sum += nums[i];
            return sum / nums.length;
        };

        // 길이인 4인 배열 전달
        double[] values = { 1.0, 2.0, 3.0, 4.0 };
        System.out.println("The average is " + average.execute(values));

        // 길이가 0인 배열 전달
        double[] valuesEmpty = new double[0];
        System.out.println("The average is " + average.execute(valuesEmpty));

    }
}

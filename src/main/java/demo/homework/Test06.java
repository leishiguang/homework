package demo.homework;


public class Test06 {
    public static void main(String[] args) {
        /*
         * 计算1000以内所有不能被7整除的整数之和
         */
        int sum = 0;
        int i;
        for (i = 0; i <= 1000; i++) {
            if (i % 7 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

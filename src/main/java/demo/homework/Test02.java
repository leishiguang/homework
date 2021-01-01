package demo.homework;

public class Test02 {

    public static void main(String[] args) {
		/*
		使用for循环遍历100以内的奇数，并计算所有的奇数的和并输出。
		*/

        int i = 0;
        int sum = 0;
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("100以内所有奇数的和是：" + sum);
    }
}
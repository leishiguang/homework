package demo.homework;

import java.util.Scanner;

public class Test15 {
    //题目：计算 1! + 2! + 3! + 4! +... + 10!
    //	说明：4! 表示4的阶乘。4的阶乘是：1 * 2 * 3 * 4
    public static void main(String[] args) {
        boolean flag = true;
        System.out.print("请输入一个正整数:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 1;

        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        System.out.println("阶乘是：" + sum);


    }
}

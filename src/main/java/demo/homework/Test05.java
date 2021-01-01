package demo.homework;


import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        /*
         * 编写程序，由键盘输入三个整数分别存入变量num1,num2,num3中，
         * 它们进行排序，使用if-else结构，并按从小到大的顺序输出
         */
        System.out.println("请输入第一个数字：");
        Scanner input1 = new Scanner(System.in);
        int num1 = input1.nextInt();
        System.out.println("请输入第二个数字：");
        Scanner input2 = new Scanner(System.in);
        int num2 = input2.nextInt();
        System.out.println("请输入第三个数字：");
        Scanner input3 = new Scanner(System.in);
        int num3 = input3.nextInt();
        System.out.println("您输入的三个数字分别是：" + num1 + "," + num2 + "," + num3);
        if (num1 < num2) {
            if (num2 < num3) {
                System.out.println("从小到大排列：" + num1 + "," + num2 + "," + num3);
            } else if (num3 < num2) {
                if (num1 < num3) {
                    System.out.println("从小到大排列：" + num1 + "," + num3 + "," + num2);
                } else
                    System.out.println("从小到大排列：" + num3 + "," + num1 + "," + num2);
            }

        } else if (num3 < num2) {
            System.out.println("从小到大排列：" + num3 + "," + num2 + "," + num1);
            if (num1 < num3) {
                System.out.println("从小到大排列：" + num2 + "," + num1 + "," + num3);
            }
        }
    }

}


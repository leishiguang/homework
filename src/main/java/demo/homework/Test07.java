package demo.homework;


public class Test07 {
    public static void main(String[] args) {
        //定义三个int型变量并赋值，使用三元运算符或者if-else获取这三个数中的较大数的实现
        int num1 = 11;
        int num2 = 15;
        int num3 = 20;
        int max = ((num1 > num2) ? num1 : num2 > num3 ? (num1 > num2) ? num1 : num2 : num3);
        System.out.println(max);

    }
}

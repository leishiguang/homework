package demo.homework;

public class Test11 {
    //输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数
    //字立方和等于其本身。
    //例如： 153 = 1*1*1 + 3*3*3 + 5*5*5
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int a = i / 100;
            int b = i % 100 / 10;
            int c = i % 10;
            int sum = a * a * a + b * b * b + c * c * c;
            if (sum == i) System.out.println(i);

        }
    }
}

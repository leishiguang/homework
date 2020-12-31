import java.util.Scanner;

public class Test13 {
//从键盘接收一个正整数，该正整数作为行数，输出以下图形
//    *
//   ***
//  *****
// *******
//*********
//例如：输入5，则打印如上图5行。
public static void main(String[] args) {
    System.out.println("请输入一个正整数");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    for (int i = 1; i <= num; i++) {
        for (int k = 0; k < num - i; k++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= 2 * i - 1; j++) {
            System.out.print('*');
        }
        System.out.println();
    }
}
}

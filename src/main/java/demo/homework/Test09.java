package demo.homework;

import java.util.Scanner;

public class Test09 {
    /*
      岳小鹏参加Java考试，他和父亲岳不群达成承诺：
      如果：
      成绩为100分时，奖励一辆BMW；
      成绩为(80，99]时，奖励一台iphone xs max；
      当成绩为[60,80]时，奖励一个 iPad；
      其它时，什么奖励也没有。
      请从键盘输入岳小鹏的期末成绩，并加以判断
     */
    public static void main(String[] args) {
        System.out.println("请输入你的成绩：");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        if (score < 0 || score > 100) {
            System.out.println("你输入的成绩有误，请重新输入");
        } else if (score == 100) {
            System.out.println("你可以得到一辆BMW");
        } else if (score > 80) {
            System.out.println("你可以得到一台iphone xs max");
        } else if (score >= 60) {
            System.out.println("你可以得到一个iPad");
        } else {
            System.out.println("没有奖励");
        }

    }
}

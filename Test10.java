public class Test10 {
    //打印1~100之间所有是7的倍数的整数的个数及总和（体会设置计数
    //器的思想）
    public static void main(String[] args) {
       int count = 0;
       int sum = 0;
       for (int i = 1;i <= 100; i++){
           if (i > 6 && i % 7 == 0){
               sum += i;
               count++;
           }
       }
        System.out.println("总和是：" + sum );
        System.out.println("个数是：" + count);
    }
}

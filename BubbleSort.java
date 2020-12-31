public class BubbleSort {
    public static void main(String[] args) {
        int[] arry = new int[]{-5, 6, 60, 77, 80, -20, -1, 30, 7};
        //冒泡排序
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry.length - 1 - i; j++) {
                if (arry[j] > arry[j + 1]) {
                    int temp = arry[j];
                    arry[j] = arry[j + 1];
                    arry[j + 1] = temp;
                }
            }

        }
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i] + "     ");
        }
    }

}

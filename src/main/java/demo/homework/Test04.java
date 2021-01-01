package demo.homework;

public class Test04 {
    public static void main(String[] args) {
	/*
	���𲽼�8Ԫ��3KM���ڣ�
	����3KM��������ÿ����1.2Ԫ
	����5KM��������ÿ����1.5Ԫ
	���ڼ����Ͻ��չ��������ó��ܼۡ�
	*/
        System.out.println("������·��");
        java.util.Scanner input = new java.util.Scanner(System.in);
        double distance = input.nextDouble();
        System.out.println("�������·����" + distance);
        double cost = 0;
        if (distance <= 3) {
            cost = 8.0;
        } else if (distance <= 5) {
            cost = 8.0 + 1.2 * (distance - 3);
        } else {
            cost = 8.0 + 2 * 1.2 + 1.5 * (distance - 5);
        }
        System.out.println("���������" + cost);
    }
}
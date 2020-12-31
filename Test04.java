import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
	/*
	打车起步价8元（3KM以内）
	超过3KM，超出的每公里1.2元
	超过5KM，超出的每公里1.5元
	请在键盘上接收公里数，得出总价。
	*/
	System.out.println("请输入路程");
	java.util.Scanner input = new java.util.Scanner(System.in);
		double distance = input.nextDouble();
	System.out.println("您输入的路程是" + distance );
		double cost = 0;
	if (distance <= 3 ){
		cost = 8.0;
	}else if (distance <= 5){
		cost = 8.0 + 1.2*(distance - 3);
	}else{
		cost = 8.0 + 2*1.2 + 1.5*(distance - 5);
		}
	System.out.println("所需费用是" + cost );
	}
}
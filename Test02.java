public class Test02{

	public static void main(String[] args){
		/*
		ʹ��forѭ������100���ڵ����������������е������ĺͲ������
		*/
		
		int i = 0;
		int sum = 0 ;
		for (i = 1;i <= 100 ; i++ ){
			if (i % 2 == 1 ){
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("100�������������ĺ��ǣ�" + sum);
	}
}
public class Test03{
	public static void main(String[] args){

/*
һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ"����"��
����6=1��2��3��
��� �ҳ�1000���ڵ����������������ӣ���ȥ��������������Լ����
*/
		int num = 0;
		for ( int i = 1;i <= 1000 ;i++ ){
			num = 0;
			for (int j = 1;j <= i/2 ;j++ ){
				if(i % j == 0 ){
					num += j;
				}
			}
			if(i == num){
				System.out.println(i);
			}
		}
	}
}
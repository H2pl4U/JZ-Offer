package ��ָoffer;


/**
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n��
 * �������쳲��������еĵ�n���0��ʼ����0��Ϊ0����n<=39
 * @author ilovejava1314
 */
public class 쳲���������07 {

	public static void main(String[] args) {
		System.out.println(Fibonacci2(3));
	}
	
	/*
	 * ˼·: �۲�1 1 2 3 5 8 13
	 * ���ִӵ����ʼ���������ֵΪǰ����ĺ͡�
	 * �ɴ����ͨ���м�������������ۼӣ�
	 * a�ĳ�ʼλ���ڵ�һ��,b�ĳ�ʼλ���ڵڶ���
	 * �ۼ�ʱ����a��ֵb��b�����ۼ�c��c�ٸ�ֵa��
	 * �൱��c����aδ��ֵʱ���ֵ��������������ۼ�
	 * ---------------------------------------
	  * ����ʱ�䣺15ms
	  * ռ���ڴ棺9160k
	 */
	public static int Fibonacci(int n) {
		int a=1,b=1,c=0,i=0;
		while(i<n) {
			a=b;
			b=b+c;
			c=a;
			i++;
		}
		return c;
    }
	
	/*
	 *�ݹ�˼·
	 * ---------------------------------------
	 * ����ʱ�䣺1236ms
	 * ռ���ڴ棺9416k
	 */
	public static int Fibonacci2(int n) {
		if(n<=1) return n;
		else return Fibonacci2(n-1)+Fibonacci2(n-2);
	}

}

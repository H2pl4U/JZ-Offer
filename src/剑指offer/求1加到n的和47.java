package ��ָoffer;


/**
 * ��1+2+3+...+n��Ҫ����ʹ�ó˳�����for��while��if��
 * else��switch��case�ȹؼ��ּ������ж���䣨A?B:C����
 * 
 * ����֪ʶ�㣺 ����ת��
 * @author ilovejava1314
 */
public class ��1�ӵ�n�ĺ�47 {
	public static void main(String[] args) {
		System.out.println(Sum_Solution(10));
	}
	
	/*
	 * ˼·:
	 * ����ʹ��ѭ����ݹ鶼�ܺ���⣬���Ǹ���Ҫ��ѭ�������ã�
	 * �ݹ���ȱ���������������ö�·�����취����ߵ�����Ϊfalse
	 * ֱ����һ�У��������ҵ��ݹ����������������ͽ���ˡ�
	 * -----------------------------------------------
	 * ����ʱ�䣺15ms
	 * ռ���ڴ棺9280k
	 */
	public static int Sum_Solution(int n) {
		int res =0,a=1;
		boolean f = ((n!=0)&&a==(res=Sum_Solution(n-1)));
		res+=n;
		return res;
    }

}

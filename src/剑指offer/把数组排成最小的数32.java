package ��ָoffer;

import java.util.Arrays;

/**
 * ����һ�����������飬����������������ƴ�������ų�һ��������ӡ
 * ��ƴ�ӳ���������������С��һ����������������{3��32��321}����
 * ��ӡ���������������ųɵ���С����Ϊ321323��
 * @author ilovejava1314
 */
public class �������ų���С����32 {

	public static void main(String[] args) {
		int[] arr = {3,32,321};
		System.out.println(PrintMinNumber(arr));
	}
	
	
	 /*
	  * ˼·:
	  * ���Կ�����һ���������⣬�ڱȽ������ַ��� S1 �� S2 �Ĵ�Сʱ��
	  * Ӧ�ñȽϵ��� S1+S2 �� S2+S1 �Ĵ�С����� S1+S2 < S2+S1��
	  * ��ôӦ�ð� S1 ����ǰ�棬����Ӧ�ð� S2 ����ǰ�档
	  * 
	  * ˼·Դ��CyC���С�
	  *----------------------
	  * ����ʱ�䣺147ms
	  * ռ���ڴ棺14960k
	 */
	public static String PrintMinNumber(int [] numbers) {
		if(numbers==null||numbers.length==0) 
			return "";
		int len = numbers.length;
		String[] res = new String[len];
		for (int i = 0; i < numbers.length; i++) {
			res[i] = numbers[i]+"";
		}
		Arrays.sort(res, (s1,s2) -> (s1+s2).compareTo(s2+s1));
		String str = "";
		for (String ss : res) {
			str+=ss;
		}
		return str;
    }
}

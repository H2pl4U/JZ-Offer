package ��ָoffer;


/**
 * ��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)
 * ���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��, ���û��
 * �򷵻� -1����Ҫ���ִ�Сд��
 * 
 * ����֪ʶ�㣺 �ַ���
 * --------------------------------------------
 * @author ilovejava1314
 */
public class ��һ��ֻ����һ�ε��ַ�34 {

	public static void main(String[] args) {
		String str = "abcdffabcdeeggz";
		System.out.println(FirstNotRepeatingChar(str));
		System.out.println((int)'f');
	}
	
	
	 /*
	  * ˼·:
	  * 	��Ŀ�����ַ���ֻ����Сд��ĸ�������ַ�����洢�ַ�����
	  * �������������һ������Ϊ'z'+1���������洢A��z���ֵĴ�����
	  * �������ַ����飬�ҵ���һ�����ִ���Ϊ1�ַ���λ�á�
	  *-------------------------------------------------
	  * ����ʱ�䣺27ms
	  * ռ���ڴ棺9352k
	 */
	public static int FirstNotRepeatingChar(String str) {
        char[] c = str.toCharArray();
        int[] a = new int['z'+1];
        for (char i : c) {
			a[(int)i]++;
		}
        for (int i = 0; i < c.length; i++) {
			if(a[(int)c[i]]==1)
				return i;
		}
        return -1;
    }
}

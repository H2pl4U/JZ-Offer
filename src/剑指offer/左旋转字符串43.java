package ��ָoffer;


/**
 * �����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵�����
 * �������ַ���ģ�����ָ���������������һ���������ַ�����S������
 * ����ѭ������Kλ���������������磬�ַ�����S=��abcXYZdef��,Ҫ����
 * ��ѭ������3λ��Ľ��������XYZdefabc�����ǲ��Ǻܼ򵥣�OK���㶨����
 * 
 * ����֪ʶ�㣺 �ַ���
 * --------------------------------------------
 * @author ilovejava1314
 */
public class ����ת�ַ���43 {	
	public static void main(String[] args) {
		String s = "abcXYZdef";
		System.out.println(LeftRotateString(s, 10));
	}
	
	 /*
	  * ˼·:
	  * 	�����ַ�����ƴ���������������
	  *----------------------------------
	  * ����ʱ�䣺16ms
	  * ռ���ڴ棺9540k
	 */
	public static String LeftRotateString(String str,int n) {
		if(str.length()==0) return "";
		n=n%str.length();
		return str.substring(n)+str.substring(0, n);
    }


	
}

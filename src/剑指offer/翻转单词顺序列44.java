package ��ָoffer;

import java.util.ArrayList;

/**
 * ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��
 * дЩ�����ڱ����ϡ�ͬ��Cat��Fishд�������ĸ���Ȥ����һ������
 * Fish������������ȴ������������˼�����磬��student. a am I����
 * ��������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ���ȷ�ľ���Ӧ��
 * �ǡ�I am a student.����Cat��һһ�ķ�ת��Щ����˳��ɲ����У���
 * �ܰ�����ô��
 * 
 * ����֪ʶ�㣺 �ַ���
 * --------------------------------------------
 * @author ilovejava1314
 */
public class ��ת����˳����44 {	
	public static void main(String[] args) {
		String s = "student. a am I";
		System.out.println(ReverseSentence2(s));
	}
	
	 /*
	  * ˼·:
	  * 	���˼·�ȽϷ������õ�����������forѭ����
	  * ���Ƚ�str�����ַ������У�Ȼ��ÿ�����ʴ���
	  * ArrayList�У���������ַ�����ArrayList��
	  * ֵ������ɷ�ת����˳�����
	  *----------------------------------
	  * ����ʱ�䣺26ms
	  * ռ���ڴ棺9576k
	 */
	public static String ReverseSentence(String str) {
		if(str.trim().equals("")){
            return str;
        }
		ArrayList<String> list = new ArrayList<String>();
		char[] ch = new char[str.length()];
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			ch[i]=str.charAt(i);
		}
		for (int i = 0; i < ch.length; i++) {
			s=s+ch[i];
			if(ch[i]==' '||i==ch.length-1) {
				s=s.trim();
				list.add(s);
				s="";
			}
		}
		s="";
		for (int i = list.size()-1; i >=0; i--) {
			s=s+list.get(i)+" ";
		}
		return s.substring(0, s.length()-1);
    }
	
	
	/*
	  * ˼·:
	  * 	˼·���һ�����ƣ������˺ܶ࣬��ͨ���ո�
	  * ��ÿ�����ʷ����ַ��������У�Ȼ�������򽫵��ʴ���
	  * StringBuffer�з�����ӿո����շ�����toString()���
	  * 
	  *----------------------------------
	  * ����ʱ�䣺20ms
	  * ռ���ڴ棺9476k
	 */
	public static String ReverseSentence2(String str) {
	    if(str.trim().equals("")){
	        return str;
	    }
	    String[] a = str.split(" ");
	    for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	    StringBuffer o = new StringBuffer();
	    int i;
	    for (i = a.length; i >0;i--){
	        o.append(a[i-1]);
	        if(i > 1){
                o.append(" ");
            }
	   }
	   return o.toString();
	}


	
}

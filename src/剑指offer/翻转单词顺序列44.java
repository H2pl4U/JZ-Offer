package 剑指offer;

import java.util.ArrayList;

/**
 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，
 * 写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，有一天他向
 * Fish借来翻看，但却读不懂它的意思。例如，“student. a am I”。
 * 后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该
 * 是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你
 * 能帮助他么？
 * 
 * 本题知识点： 字符串
 * --------------------------------------------
 * @author ilovejava1314
 */
public class 翻转单词顺序列44 {	
	public static void main(String[] args) {
		String s = "student. a am I";
		System.out.println(ReverseSentence2(s));
	}
	
	 /*
	  * 思路:
	  * 	这个思路比较繁琐，用到了三个单层for循环，
	  * 首先将str存入字符数组中，然后将每个单词存入
	  * ArrayList中，逆序给空字符串赋ArrayList的
	  * 值即可完成翻转单词顺序操作
	  *----------------------------------
	  * 运行时间：26ms
	  * 占用内存：9576k
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
	  * 思路:
	  * 	思路与第一种相似，单简化了很多，先通过空格
	  * 将每个单词放入字符串数组中，然后再逆序将单词存入
	  * StringBuffer中方便添加空格。最终返回其toString()结果
	  * 
	  *----------------------------------
	  * 运行时间：20ms
	  * 占用内存：9476k
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

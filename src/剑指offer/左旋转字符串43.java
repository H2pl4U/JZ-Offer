package 剑指offer;


/**
 * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，
 * 就是用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，请你
 * 把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,要求输
 * 出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 * 
 * 本题知识点： 字符串
 * --------------------------------------------
 * @author ilovejava1314
 */
public class 左旋转字符串43 {	
	public static void main(String[] args) {
		String s = "abcXYZdef";
		System.out.println(LeftRotateString(s, 10));
	}
	
	 /*
	  * 思路:
	  * 	利用字符串的拼接完成左旋操作。
	  *----------------------------------
	  * 运行时间：16ms
	  * 占用内存：9540k
	 */
	public static String LeftRotateString(String str,int n) {
		if(str.length()==0) return "";
		n=n%str.length();
		return str.substring(n)+str.substring(0, n);
    }


	
}

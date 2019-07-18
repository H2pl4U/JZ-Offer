package 剑指offer;

import java.util.Arrays;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印
 * 能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则
 * 打印出这三个数字能排成的最小数字为321323。
 * @author ilovejava1314
 */
public class 把数组排成最小的数32 {

	public static void main(String[] args) {
		int[] arr = {3,32,321};
		System.out.println(PrintMinNumber(arr));
	}
	
	
	 /*
	  * 思路:
	  * 可以看成是一个排序问题，在比较两个字符串 S1 和 S2 的大小时，
	  * 应该比较的是 S1+S2 和 S2+S1 的大小，如果 S1+S2 < S2+S1，
	  * 那么应该把 S1 排在前面，否则应该把 S2 排在前面。
	  * 
	  * 思路源于CyC大佬。
	  *----------------------
	  * 运行时间：147ms
	  * 占用内存：14960k
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

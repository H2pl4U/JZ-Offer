package 剑指offer;


/**
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)
 * 中找到第一个只出现一次的字符,并返回它的位置, 如果没有
 * 则返回 -1（需要区分大小写）
 * 
 * 本题知识点： 字符串
 * --------------------------------------------
 * @author ilovejava1314
 */
public class 第一个只出现一次的字符34 {

	public static void main(String[] args) {
		String str = "abcdffabcdeeggz";
		System.out.println(FirstNotRepeatingChar(str));
		System.out.println((int)'f');
	}
	
	
	 /*
	  * 思路:
	  * 	题目限制字符串只含大小写字母，利用字符数组存储字符串，
	  * 方便遍历，创建一个长度为'z'+1的数组来存储A到z出现的次数，
	  * 最后遍历字符数组，找到第一个出现次数为1字符的位置。
	  *-------------------------------------------------
	  * 运行时间：27ms
	  * 占用内存：9352k
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

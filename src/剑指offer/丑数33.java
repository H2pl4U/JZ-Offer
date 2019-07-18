package 剑指offer;


/**
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含质因子7。 习
 * 惯上我们把1当做是第一个丑数。求按从小到大的顺序的
 * 第N个丑数。
 * 
 * 本题知识点： 穷举
 * --------------------------------------------
 * @author ilovejava1314
 */
public class 丑数33 {

	public static void main(String[] args) {
		System.out.println(GetUglyNumber_Solution(11));
	}
	
	
	 /*
	  * 思路:
	  * 	归纳+穷举，详情见个人博客
	  *----------------------
	  * 运行时间：14ms
	  * 占用内存：9296k
	 */
	public static int GetUglyNumber_Solution(int index) {
		if (index < 7)
	        return index;
	    int i2 = 0, i3 = 0, i5 = 0;
	    int[] dp = new int[index];
	    dp[0] = 1;
	    for (int i = 1; i < index; i++) {
	        int next2 = dp[i2] * 2, next3 = dp[i3] * 3, next5 = dp[i5] * 5;
	        dp[i] = Math.min(next2, Math.min(next3, next5));
	        if (dp[i] == next2)
	            i2++;
	        if (dp[i] == next3)
	            i3++;
	        if (dp[i] == next5)
	            i5++;
	    }
	    return dp[index - 1];
    }
}

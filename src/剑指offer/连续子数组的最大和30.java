package 剑指offer;


/**
 *HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。
 *今天测试组开完会后,他又发话了:在古老的一维模式识别中,
 *常常需要计算连续子向量的最大和,当向量全为正数的时候,
 *问题很好解决。但是,如果向量中包含负数,是否应该包含某
 *个负数,并期望旁边的正数会弥补它呢？
 *例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8
 *(从第0个开始,到第3个为止)。给一个数组，返回它的
 *最大连续子序列的和，你会不会被他忽悠住？
 *(子向量的长度至少是1)
 * @author ilovejava1314
 */
public class 连续子数组的最大和30 {

	public static void main(String[] args) {
		int [] array = {1,-2,3,10,-4,7,2,-5};
		System.out.println(FindGreatestSumOfSubArray(array));
	}

	
	/*
	  * 思路:
	  * 动态规划，F（i）：以array[i]为末尾元素的子数组的和的最大值，子数组的元素的相对位置不变
	 * F（i）=max（F（i-1）+array[i] ， array[i]）
	 * res：所有子数组的和的最大值
	 * res=max（res，F（i））
	 *----------------------
	  * 运行时间：14ms
	  * 占用内存：9304k
	 */
	public static int FindGreatestSumOfSubArray(int[] array) {
		int res = array[0]; //记录当前所有子数组的和的最大值
        int max=array[0];   //包含array[i]的连续数组最大值
		for (int i = 1; i < array.length; i++) {
			max = Math.max(array[i]+max, array[i]);
			res = Math.max(max,res);
		}
		return res;
	}
	
	/*
	  * 思路:
	  * 同样的动态规划的常规版本，curSum记录当前累加后的最大值
	 * greatestSum保存CurSum的最大值
	 *-----------------------------
	  * 运行时间：14ms
	  * 占用内存：9304k
	 */
	public static int FindGreatestSumOfSubArray2(int[] array) {
		if (array.length==0 || array==null) {
	        return 0;
	    }
	    int curSum=0;
	    int greatestSum=array[0];
	    for (int i = 0; i < array.length; i++) {
	        if (curSum<=0) {
	            curSum=array[i]; //记录当前最大值
	        }else {
	            curSum+=array[i]; //当array[i]为正数时，加上之前的最大值并更新最大值。
	        }
	        if (curSum>greatestSum) {
	            greatestSum=curSum; 
	        }
	    }
	    return greatestSum;
	}
}

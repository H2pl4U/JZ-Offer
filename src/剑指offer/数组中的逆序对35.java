package 剑指offer;


/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，
 * 则这两个数字组成一个逆序对。输入一个数组,求出这个数
 * 组中的逆序对的总数P。并将P对1000000007取模的结果输
 * 出。 即输出P%1000000007
 * 
 * 本题知识点： 数组
 * --------------------------------------------
 * @author ilovejava1314
 */
public class 数组中的逆序对35 {

	 /*
	  * 思路:
	  * 	归并排序的改进，把数据分成前后两个数组
	  * (递归分到每个数组仅有一个数据项)，合并数组，
	  * 合并时，出现前面的数组值array[i]大于后面数
	  * 组值array[j]时；则前面数组array[i]~array[mid]
	  * 都是大于array[j]的，count += mid+1 - i
	  *-------------------------------------------------
	  * 运行时间：595ms
	  * 占用内存：54472k
	 */
	private long cnt = 0;
	private int[] tmp;  // 在这里声明辅助数组，而不是在 merge() 递归函数中声明

	public int InversePairs(int[] nums) {
	    tmp = new int[nums.length];
	    mergeSort(nums, 0, nums.length - 1);
	    return (int) (cnt % 1000000007);
	}

	private void mergeSort(int[] nums, int l, int h) {
	    if (h - l < 1)
	        return;
	    int m = l + (h - l) / 2;
	    mergeSort(nums, l, m);
	    mergeSort(nums, m + 1, h);
	    merge(nums, l, m, h);
	}

	private void merge(int[] nums, int l, int m, int h) {
	    int i = l, j = m + 1, k = l;
	    while (i <= m || j <= h) {
	        if (i > m)
	            tmp[k] = nums[j++];
	        else if (j > h)
	            tmp[k] = nums[i++];
	        else if (nums[i] <= nums[j])
	            tmp[k] = nums[i++];
	        else {
	            tmp[k] = nums[j++];
	            this.cnt += m - i + 1;  // nums[i] > nums[j]，说明 nums[i...mid] 都大于 nums[j]
	        }
	        k++;
	    }
	    for (k = l; k <= h; k++)
	        nums[k] = tmp[k];
	}
}

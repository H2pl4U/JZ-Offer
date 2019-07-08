package 剑指offer;

/*
  * 在一个二维数组中（每个一维数组的长度相同），
  * 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
  * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

public class 二维数组中的查找01 {
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},{2,3,4},{3,4,6}
		};
		System.out.println(Find1(6, arr));
	}
	
	/*
	 * 思路：既然该二维数组有递增规律，查找数据使用二分法效率较高，
	 * 以左下端点为中心点，仅需判断target与此点值的大小，
	 * 若target大于此点的值，那么仅仅需要右移一次，即i++
	 * 若target小于此点的值，那么仅仅需要上移一次，即j--
	 * 若target正好等于此点值时返回true，循环结束也没有相等的值则返回false
	 * 时间复杂度是O(nlogn)
	 * -------------
	 * 当然也可从右上端点为中心点，过程类似。
	 */
	static boolean Find(int target, int [][] array) {
		int rows = array.length;
		int cols = array[0].length;
		int i = 0;
		int j = cols-1;
		while(i<rows && j >= 0) {
			if(array[i][j] < target) i++;
			else if(array[i][j] > target) j--;
			else return true;
		}
		return false;
    }
	
	static boolean Find1(int target, int [][] array) {
		int rows = array.length;
		int cols = array[0].length;
		int i = rows-1;
		int j = 0;
		while(i>=0 && j < cols) {
			if(array[i][j] < target) j++;
			else if(array[i][j] > target) i--;
			else return true;
		}
		return false;
	}

}

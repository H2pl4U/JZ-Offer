package 二刷;

public class 二维数组中的查找01 {

	/*
	 * ac 100%
	 * 运行时间：179ms
	 * 占用内存：18076k
	 */
	public static boolean Find(int target, int [][] array) {
		int row = array[0].length;
		int col = array.length;
		int i = 0,j = col;
		while(i < row && j >= 0) {
			if(array[i][j] == target) return true;
			else if(array[i][j] < target) i++;
			else j--;
		}
		return false;
	}
	
}

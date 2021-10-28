package 剑指offer;

import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @author ilovejava1314
 */
public class 顺时针打印矩阵19 {

	public static void main(String[] args) {
		//{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}
		int [][] matrix = {{1,2},{3,4},{5,6},{7,8},{9,10},{11,12}};
		ArrayList<Integer> list = printMatrix(matrix);
		for (Integer integer : list) {
			System.out.print(integer+" ");
		}
	}
	
	
	
	/*
	 * 思路:从外围的(0,0)点开始顺时针开始，分四个阶段，首先遍历从左到右，
	 * 再从上到下，从右到左，从下到上，外围就遍历完了。然后条件再从(1，1)
	 * 开始，相同的顺序遍历，直到遍历整个矩阵。定义上下左右四个变量来完成
	 * 外围到下一个内围的条件，确保每次循环只顺时针遍历一个围。
	 * -----------------------------------------------
	 * 运行时间：46ms
	 * 占用内存：9312k
	 */
	public static ArrayList<Integer> printMatrix(int [][] matrix) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int row = matrix.length;
		int col = matrix[0].length;
		if(row==0||col==0) return null;
		int left=0,top=0,bottom=row-1,right=col-1;
		while(left<=right&&bottom>=top) {
			//从左到右横向
			for (int i = left; i <= right; i++) {
				list.add(matrix[top][i]);
			}
			//从上到下纵向
			for (int i = top+1; i <= bottom; i++) {
				list.add(matrix[i][right]);
			}
			//从右到左横向
			if(top!=bottom)
			for (int i = right-1; i >= left; i--) {
				list.add(matrix[bottom][i]);
			}
			//从下到上纵向
			if(right!=left)
			for (int i = bottom-1; i > left; i--) {
				list.add(matrix[i][left]);
			}
			left++;
			top++;
			right--;
			bottom--;
		}
		return list;
    }
}

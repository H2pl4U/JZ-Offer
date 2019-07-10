package ��ָoffer;

import java.util.ArrayList;

/**
 * ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
 * ���磬�����������4 X 4���� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @author ilovejava1314
 */
public class ˳ʱ���ӡ����19 {

	public static void main(String[] args) {
		//{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}
		int [][] matrix = {{1,2},{3,4},{5,6},{7,8},{9,10},{11,12}};
		ArrayList<Integer> list = printMatrix(matrix);
		for (Integer integer : list) {
			System.out.print(integer+" ");
		}
	}
	
	
	
	/*
	 * ˼·:����Χ��(0,0)�㿪ʼ˳ʱ�뿪ʼ�����ĸ��׶Σ����ȱ��������ң�
	 * �ٴ��ϵ��£����ҵ��󣬴��µ��ϣ���Χ�ͱ������ˡ�Ȼ�������ٴ�(1��1)
	 * ��ʼ����ͬ��˳�������ֱ�������������󡣶������������ĸ����������
	 * ��Χ����һ����Χ��������ȷ��ÿ��ѭ��ֻ˳ʱ�����һ��Χ��
	 * -----------------------------------------------
	 * ����ʱ�䣺46ms
	 * ռ���ڴ棺9312k
	 */
	public static ArrayList<Integer> printMatrix(int [][] matrix) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int row = matrix.length;
		int col = matrix[0].length;
		if(row==0||col==0) return null;
		int left=0,top=0,bottom=row-1,right=col-1;
		while(left<=right&&bottom>=top) {
			//�����Һ���
			for (int i = left; i <= right; i++) {
				list.add(matrix[top][i]);
			}
			//���ϵ�������
			for (int i = top+1; i <= bottom; i++) {
				list.add(matrix[i][right]);
			}
			//���ҵ������
			if(top!=bottom)
			for (int i = right-1; i >= left; i--) {
				list.add(matrix[bottom][i]);
			}
			//���µ�������
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

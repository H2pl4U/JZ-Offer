package ��ˢ;

public class ��ά�����еĲ���01 {

	/*
	 * ac 100%
	 * ����ʱ�䣺179ms
	 * ռ���ڴ棺18076k
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

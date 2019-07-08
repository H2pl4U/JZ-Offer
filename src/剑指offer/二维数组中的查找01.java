package ��ָoffer;

/*
  * ��һ����ά�����У�ÿ��һά����ĳ�����ͬ����
  * ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
  * �����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 */

public class ��ά�����еĲ���01 {
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},{2,3,4},{3,4,6}
		};
		System.out.println(Find1(6, arr));
	}
	
	/*
	 * ˼·����Ȼ�ö�ά�����е������ɣ���������ʹ�ö��ַ�Ч�ʽϸߣ�
	 * �����¶˵�Ϊ���ĵ㣬�����ж�target��˵�ֵ�Ĵ�С��
	 * ��target���ڴ˵��ֵ����ô������Ҫ����һ�Σ���i++
	 * ��targetС�ڴ˵��ֵ����ô������Ҫ����һ�Σ���j--
	 * ��target���õ��ڴ˵�ֵʱ����true��ѭ������Ҳû����ȵ�ֵ�򷵻�false
	 * ʱ�临�Ӷ���O(nlogn)
	 * -------------
	 * ��ȻҲ�ɴ����϶˵�Ϊ���ĵ㣬�������ơ�
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

package ��ָoffer;

import java.util.ArrayList;

/**
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��
 * ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֣�
 * ����֤������������ż����ż��֮������λ�ò��䡣
 * @author ilovejava1314
 */
public class ��������˳��ʹ����λ��ż��ǰ��13 {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6};
		reOrderArray(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
	
	/*
	 * ˼·:��������arraylist���ֱ�洢������ż�����ٸ�ֵ��ԭ����
	 * ------------------------
	  * ����ʱ�䣺22ms
	  * ռ���ڴ棺9316k
	 */
	public static void reOrderArray(int [] array) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
			if((array[i]&1)==1) {
				list1.add(array[i]);
			}else {
				list2.add(array[i]);
			}
		}
        for (int i = 0; i < list1.size(); i++) {
        	array[i]=list1.get(i);
        }
        for (int i = list1.size(); i < array.length; i++) {
        	array[i]=list2.get(i-list1.size());
		}
    }

}

package ��ָoffer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ����n���������ҳ�������С��K������
 * ��������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
 * @author ilovejava1314
 */
public class ��С��K����29 {

	public static void main(String[] args) {
		int [] input = {4,5,1,6,2,7,3,8};
		ArrayList<Integer> res = GetLeastNumbers_Solution(input, 10);
		System.out.println(res.toString());
	}
	
	
	/*
	  * ˼·:
	  * ��Ҫ�ҳ���С��k�������Ƚ���������Arrays����
	  * ��ѭ����list��ֵ��ѭ��������С��k��
	  * ע�⣺��k�������鳤��ʱֱ�ӷ��ؿ�list��
	 *----------------------
	  * ����ʱ�䣺40ms
	  * ռ���ڴ棺9500k
	 */
	public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(k>input.length) return list;
		Arrays.sort(input);
		for (int i = 0; i < k; i++) {
			list.add(input[i]);
		}
		return list;
    }
}

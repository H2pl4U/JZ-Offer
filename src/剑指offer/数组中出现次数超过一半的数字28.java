package 剑指offer;

import java.util.Arrays;

/*
 *数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 *例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中
 *出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * @author ilovejava1314
 */
public class 数组中出现次数超过一半的数字28 {

	public static void main(String[] args) {
		int[] array = { 7, 6, 2, 2, 2, 2, 2, 5 };
		System.out.println(MoreThanHalfNum_Solution(array));
	}

	/*
	 * 思路: 首先根据题意，明白排序后的数组中出现次数超过长度一半的数字必定会在数组中间位置出现
	 * 即变相的找出这个可能的数，只需统计出该数的个数，再判断是否真的超过了长度的 一半即可。
	 * -------------------------------------------- 
	 * 运行时间：15ms
	 * 占用内存：9220k
	 */
	public static int MoreThanHalfNum_Solution(int[] array) {
		int len = array.length;
		// 边界
		if (len == 0)
			return 0;
		// 排序
		Arrays.sort(array);
		int count = 0;
		//
		for (int i = 0; i < len; i++) {
			if (array[i] == array[len / 2])
				count++;
		}
		if (count > len / 2)
			return array[len / 2];
		return 0;
	}

}

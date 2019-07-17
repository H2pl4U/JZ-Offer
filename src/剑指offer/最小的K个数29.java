package 剑指offer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * @author ilovejava1314
 */
public class 最小的K个数29 {

	public static void main(String[] args) {
		int [] input = {4,5,1,6,2,7,3,8};
		ArrayList<Integer> res = GetLeastNumbers_Solution(input, 10);
		System.out.println(res.toString());
	}
	
	
	/*
	  * 思路:
	  * 想要找出最小的k个数，先将数组利用Arrays排序，
	  * 再循环给list赋值，循环条件是小于k。
	  * 注意：当k大于数组长度时直接返回空list。
	 *----------------------
	  * 运行时间：40ms
	  * 占用内存：9500k
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

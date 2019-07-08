package 剑指offer;

import java.util.ArrayList;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @author ilovejava1314
 */
public class 调整数组顺序使奇数位于偶数前面13 {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6};
		reOrderArray(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
	
	/*
	 * 思路:利用两个arraylist，分别存储奇数和偶数，再赋值给原数组
	 * ------------------------
	  * 运行时间：22ms
	  * 占用内存：9316k
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

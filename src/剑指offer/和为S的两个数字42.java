package 剑指offer;

import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，
 * 使得他们的和正好是S，如果有多对数字的和等于S，输出两个
 * 数的乘积最小的。
 * 
 * 本题知识点： 穷举
 * --------------------------------------------
 * @author ilovejava1314
 */
public class 和为S的两个数字42 {	
	
	 /*
	  * 思路:
	  * 	类似二分法，设定头尾指针，如果头尾指针对应的值
	  * 正好为sum，则将这两个值存入list中，大于sum尾指针自减
	  * 小于sum头指针自加。
	  *----------------------------------
	  * 运行时间：13ms
	  * 占用内存：9412k
	 */
	public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		int l=0,h=array.length-1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(h<=2||array==null) return list;
		while(l<h) {
			if(array[l]+array[h]==sum) {
				list.add(array[l]);
				list.add(array[h]);
				break;
			}
			if(l<h&&array[l]+array[h]>sum) h--;
			if(l<h&&array[l]+array[h]<sum) l++;
		}
		return list;
    }


	
}

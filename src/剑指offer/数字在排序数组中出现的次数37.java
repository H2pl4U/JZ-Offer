package 剑指offer;


/**
 * 统计一个数字在排序数组中出现的次数。
 * 
 * 本题知识点： 数组
 * -------------------------------------------- 
 * @author ilovejava1314
 */
public class 数字在排序数组中出现的次数37 {
	public static void main(String[] args) {
		int[] array = {3,3,3,3,4,5};
		System.out.println(GetNumberOfK(array, 3));
	}

	/*
	 * 思路:
	 * 		有序数组首先考虑二分法，查找出大致位置，两次循环
	 * 分别从该位置向前和向后统计相同次数，不相同时直接跳出
	 * 循环，效率较高。
	 * ---------------------------------------------
	 * 运行时间：21ms
	 * 占用内存：9392k
	 */
	public static int GetNumberOfK(int [] array , int k) {
		int pos=search(array, k);
		if(pos==-1) return 0;
		int count=0;
		//向前统计次数
		for (int i = pos; i >= 0; i--) {
			if(array[i]==k) {
				count++;
			}else break;
			
		}
		//向后统计次数
		for (int i = pos+1; i < array.length; i++) {
			if(array[i]==k) {
				count++;
			}else break;
		}
		return count;
    }
	//二分法
	public static int search(int[] array,int k) {
		int l=0,h=array.length-1;
		while(l<=h) {
			int mid = l+(h-l)/2;
			if(array[mid]==k) return mid;
			else if(array[mid]>k) h=mid-1;
			else l=mid+1;
		}
		return -1;
	}
	
	
	
	

}

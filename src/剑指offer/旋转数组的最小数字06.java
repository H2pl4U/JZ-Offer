package 剑指offer;

/*
 *把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 
 *输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。 
 *例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 *NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * @author ilovejava1314
 */
public class 旋转数组的最小数字06 {

	public static void main(String[] args) {
		int [] array = {3,4,5,1,2};
		System.out.println(minNumberInRotateArray2(array));
	}
	
	/*
	 * 思路:
	 * 根据题目意思，递增数组经过某种旋转，相当于递增数组随机从中间切开，
	 * 然后交换位置后拼接上，此时只需要找到切点就能找到最小值了，也就是
	 * 递增数组的第一个元素，通过循环判断下一个元素是否小于即可，但是
	 * 存在最差情况，时间复杂度为O(n),最好则为O(1)
	 * ---------------------------
	  * 运行时间：285ms
	  * 占用内存：28112k
	 */
	public int minNumberInRotateArray(int [] array) {
		if(array.length==0) {
			return 0;
		}
		for (int i = 0; i < array.length-1; i++) {
			if(array[i]>array[i+1]) {
				return array[i+1];
			}
		}
		return array[array.length-1];
    }
	
	/*
	 * 思路:
	 * 利用二分法查找，跳出循环的条件为right和left相差1
	 * ---------------------------
	  * 运行时间：351ms
	  * 占用内存：28882k
	 */
	public static int minNumberInRotateArray2(int [] array) {
		if(array.length==0) {
			return 0;
		}
		int left = 0;
		int right = array.length-1;
		int mid = -1;
		while(array[left]>=array[right]) {
			//已经找出切点，返回right的位置即可
			if(right-left==1) {
				 mid=right;
				 break;
			}
			mid = left+(right-left)/2;
			if(array[mid]>=array[left]) {
				left=mid;
			}
			if(array[mid]<=array[right]) {
				right=mid;
			}
		}
		return array[mid];
	}

}

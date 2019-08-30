package 二刷;

public class 旋转数组的最小数字06 {

	public static void main(String[] args) {
		
	}
	
	/*
	 * ac100%
	 * 运行时间：261ms
	 * 占用内存：28216k
	 */
	public int minNumberInRotateArray(int [] array) {
		if(array.length==0)
			return 0;
		int left = 0,right = array.length-1,mid=-1;
		while(array[left]>=array[right]) {
			if(right-left==1) {
				mid = right;
				break;
			}
			mid = left+(right-left)/2;
			if(array[mid]<=array[right])
				right=mid;
			if(array[mid]>=array[left])
				left=mid;
		}
		return array[mid];
	}

}

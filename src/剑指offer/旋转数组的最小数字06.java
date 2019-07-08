package ��ָoffer;

/*
 *��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� 
 *����һ���Ǽ�����������һ����ת�������ת�������СԪ�ء� 
 *��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
 *NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 * @author ilovejava1314
 */
public class ��ת�������С����06 {

	public static void main(String[] args) {
		int [] array = {3,4,5,1,2};
		System.out.println(minNumberInRotateArray2(array));
	}
	
	/*
	 * ˼·:
	 * ������Ŀ��˼���������龭��ĳ����ת���൱�ڵ�������������м��п���
	 * Ȼ�󽻻�λ�ú�ƴ���ϣ���ʱֻ��Ҫ�ҵ��е�����ҵ���Сֵ�ˣ�Ҳ����
	 * ��������ĵ�һ��Ԫ�أ�ͨ��ѭ���ж���һ��Ԫ���Ƿ�С�ڼ��ɣ�����
	 * ������������ʱ�临�Ӷ�ΪO(n),�����ΪO(1)
	 * ---------------------------
	  * ����ʱ�䣺285ms
	  * ռ���ڴ棺28112k
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
	 * ˼·:
	 * ���ö��ַ����ң�����ѭ��������Ϊright��left���1
	 * ---------------------------
	  * ����ʱ�䣺351ms
	  * ռ���ڴ棺28882k
	 */
	public static int minNumberInRotateArray2(int [] array) {
		if(array.length==0) {
			return 0;
		}
		int left = 0;
		int right = array.length-1;
		int mid = -1;
		while(array[left]>=array[right]) {
			//�Ѿ��ҳ��е㣬����right��λ�ü���
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

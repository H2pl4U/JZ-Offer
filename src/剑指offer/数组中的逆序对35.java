package ��ָoffer;


/**
 * �������е��������֣����ǰ��һ�����ִ��ں�������֣�
 * ���������������һ������ԡ�����һ������,��������
 * ���е�����Ե�����P������P��1000000007ȡģ�Ľ����
 * ���� �����P%1000000007
 * 
 * ����֪ʶ�㣺 ����
 * --------------------------------------------
 * @author ilovejava1314
 */
public class �����е������35 {

	 /*
	  * ˼·:
	  * 	�鲢����ĸĽ��������ݷֳ�ǰ����������
	  * (�ݹ�ֵ�ÿ���������һ��������)���ϲ����飬
	  * �ϲ�ʱ������ǰ�������ֵarray[i]���ں�����
	  * ��ֵarray[j]ʱ����ǰ������array[i]~array[mid]
	  * ���Ǵ���array[j]�ģ�count += mid+1 - i
	  *-------------------------------------------------
	  * ����ʱ�䣺595ms
	  * ռ���ڴ棺54472k
	 */
	private long cnt = 0;
	private int[] tmp;  // �����������������飬�������� merge() �ݹ麯��������

	public int InversePairs(int[] nums) {
	    tmp = new int[nums.length];
	    mergeSort(nums, 0, nums.length - 1);
	    return (int) (cnt % 1000000007);
	}

	private void mergeSort(int[] nums, int l, int h) {
	    if (h - l < 1)
	        return;
	    int m = l + (h - l) / 2;
	    mergeSort(nums, l, m);
	    mergeSort(nums, m + 1, h);
	    merge(nums, l, m, h);
	}

	private void merge(int[] nums, int l, int m, int h) {
	    int i = l, j = m + 1, k = l;
	    while (i <= m || j <= h) {
	        if (i > m)
	            tmp[k] = nums[j++];
	        else if (j > h)
	            tmp[k] = nums[i++];
	        else if (nums[i] <= nums[j])
	            tmp[k] = nums[i++];
	        else {
	            tmp[k] = nums[j++];
	            this.cnt += m - i + 1;  // nums[i] > nums[j]��˵�� nums[i...mid] ������ nums[j]
	        }
	        k++;
	    }
	    for (k = l; k <= h; k++)
	        nums[k] = tmp[k];
	}
}

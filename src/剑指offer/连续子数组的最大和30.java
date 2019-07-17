package ��ָoffer;


/**
 *HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ��
 *��������鿪����,���ַ�����:�ڹ��ϵ�һάģʽʶ����,
 *������Ҫ��������������������,������ȫΪ������ʱ��,
 *����ܺý��������,��������а�������,�Ƿ�Ӧ�ð���ĳ
 *������,�������Աߵ��������ֲ����أ�
 *����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8
 *(�ӵ�0����ʼ,����3��Ϊֹ)����һ�����飬��������
 *������������еĺͣ���᲻�ᱻ������ס��
 *(�������ĳ���������1)
 * @author ilovejava1314
 */
public class ���������������30 {

	public static void main(String[] args) {
		int [] array = {1,-2,3,10,-4,7,2,-5};
		System.out.println(FindGreatestSumOfSubArray(array));
	}

	
	/*
	  * ˼·:
	  * ��̬�滮��F��i������array[i]ΪĩβԪ�ص�������ĺ͵����ֵ���������Ԫ�ص����λ�ò���
	 * F��i��=max��F��i-1��+array[i] �� array[i]��
	 * res������������ĺ͵����ֵ
	 * res=max��res��F��i����
	 *----------------------
	  * ����ʱ�䣺14ms
	  * ռ���ڴ棺9304k
	 */
	public static int FindGreatestSumOfSubArray(int[] array) {
		int res = array[0]; //��¼��ǰ����������ĺ͵����ֵ
        int max=array[0];   //����array[i]�������������ֵ
		for (int i = 1; i < array.length; i++) {
			max = Math.max(array[i]+max, array[i]);
			res = Math.max(max,res);
		}
		return res;
	}
	
	/*
	  * ˼·:
	  * ͬ���Ķ�̬�滮�ĳ���汾��curSum��¼��ǰ�ۼӺ�����ֵ
	 * greatestSum����CurSum�����ֵ
	 *-----------------------------
	  * ����ʱ�䣺14ms
	  * ռ���ڴ棺9304k
	 */
	public static int FindGreatestSumOfSubArray2(int[] array) {
		if (array.length==0 || array==null) {
	        return 0;
	    }
	    int curSum=0;
	    int greatestSum=array[0];
	    for (int i = 0; i < array.length; i++) {
	        if (curSum<=0) {
	            curSum=array[i]; //��¼��ǰ���ֵ
	        }else {
	            curSum+=array[i]; //��array[i]Ϊ����ʱ������֮ǰ�����ֵ���������ֵ��
	        }
	        if (curSum>greatestSum) {
	            greatestSum=curSum; 
	        }
	    }
	    return greatestSum;
	}
}

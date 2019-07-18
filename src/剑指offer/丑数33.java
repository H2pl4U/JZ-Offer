package ��ָoffer;


/**
 * ��ֻ����������2��3��5��������������Ugly Number����
 * ����6��8���ǳ�������14���ǣ���Ϊ������������7�� ϰ
 * �������ǰ�1�����ǵ�һ���������󰴴�С�����˳���
 * ��N��������
 * 
 * ����֪ʶ�㣺 ���
 * --------------------------------------------
 * @author ilovejava1314
 */
public class ����33 {

	public static void main(String[] args) {
		System.out.println(GetUglyNumber_Solution(11));
	}
	
	
	 /*
	  * ˼·:
	  * 	����+��٣���������˲���
	  *----------------------
	  * ����ʱ�䣺14ms
	  * ռ���ڴ棺9296k
	 */
	public static int GetUglyNumber_Solution(int index) {
		if (index < 7)
	        return index;
	    int i2 = 0, i3 = 0, i5 = 0;
	    int[] dp = new int[index];
	    dp[0] = 1;
	    for (int i = 1; i < index; i++) {
	        int next2 = dp[i2] * 2, next3 = dp[i3] * 3, next5 = dp[i5] * 5;
	        dp[i] = Math.min(next2, Math.min(next3, next5));
	        if (dp[i] == next2)
	            i2++;
	        if (dp[i] == next3)
	            i3++;
	        if (dp[i] == next5)
	            i5++;
	    }
	    return dp[index - 1];
    }
}

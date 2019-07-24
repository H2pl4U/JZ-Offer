package ��ָoffer;

/**
 * ����һ������A[0,1,...,n-1],�빹��һ������B[0,1,...,n-1],����B��
 * ��Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]������ʹ�ó�����
 * 
 * @author ilovejava1314
 */
public class �����˻�����51 {
	
	public static void main(String[] args) {
		int[] res = {1,2,3,4,5,6};
		res = multiply(res);
		for (int i : res) {
			System.out.println(i);
		}
	}
	/*
	 * ˼·:
	 * 	����������{1��2��3��4��5}
	 *  ���Ӧ���� res[1]= 1 * 2 * 3 * 4 * 5
	 *  		res[2]= 1 * 1 * 3 * 4 * 5
	 *  		res[3]= 1 * 2 * 1 * 4 * 5
	 *  		res[4]=	1 * 2 * 3 * 1 * 5
	 *  		res[5]=	1 * 2 * 3 * 4 * 1
	 * �ҳ����ɣ��Խ��߱�1�г��������������Σ������Ϳ���
	 * �ֱ���������������۳˼��ɵó���
	 * -----------------------------------------------
	 * ����ʱ�䣺16ms
	 * ռ���ڴ棺9436k
	 */
	public static int[] multiply(int[] A) {
		int length = A.length;
		if(length==0) return A;
		int[] res = new int[length];
		//������
		res[0]=1;
		for (int i = 1; i < length; i++) {
			res[i]=A[i-1]*res[i-1];
		}
		//������
		int temp = 1;
		for (int i = length-2; i >= 0; i--) {
			temp*=A[i+1];
			res[i]*=temp;
		}
		return res;
    }

}

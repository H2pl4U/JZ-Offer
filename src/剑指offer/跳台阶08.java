package ��ָoffer;

/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
 * �����������һ��n����̨���ܹ��ж���������
 * ���Ⱥ����ͬ�㲻ͬ�Ľ������
 * @author ilovejava1314
 */
public class ��̨��08 {

	public static void main(String[] args) {
		System.out.println(JumpFloor(4));
	}
	
	/*
	 * �ݹ�˼��
	 * ---------------------------------------
	  * ����ʱ�䣺605ms
	  * ռ���ڴ棺9200k
	 */
	public static int JumpFloor(int target) {
		if(target==1) return 1;
		else if(target==2) return 2;
		else return JumpFloor(target-1)+JumpFloor(target-2);

    }
	
	/*
	 * ˼·:
	 * ������쳲��������У���������һ��̨����1������������̨����2������
	 * ����̨�׿��Դ�һ��̨��������Ҳ���ԴӶ���̨����������
	 * ������һ��̨�������������϶���̨�������������������ƿɵó�
	 * n��̨�׹���n-2��̨����������n-1��̨��������֮��
	 * 1 2 3 5 8 13 ...
	 * �ⲻ����쳲�����������
	 * ---------------------------------------
	  * ����ʱ�䣺20ms
	  * ռ���ڴ棺9436k
	 */
	public static int JumpFloor2(int target) {
		if(target==1||target==2) return target;
		int fn1=1,fn2=2,sum=0;
		while(target>2) {
			sum=fn1+fn2;
			fn1=fn2;
			fn2=sum;
			target--;
		}
		return sum;
	}
}

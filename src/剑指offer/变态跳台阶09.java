package ��ָoffer;


/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
 * �����������һ��n����̨���ܹ��ж�����������
 * @author ilovejava1314
 */
public class ��̬��̨��09 {

	public static void main(String[] args) {
		System.out.println(JumpFloorII(5));
	}
	
	/*
	 * �ҹ��ɷ��� 1 2 4 8 16 ...
	 * ��ͱ�úܼ��ˣ�����ͼ򵥵���Math.pow()ʵ��2��n-1�η��ˡ�
	 */
	public static int JumpFloorII(int target) {
		return (int) Math.pow(2,target-1);
    }
	
	/*
	 * ˼·��:
	 */
	public static int jumpFloor(int target) {
		if (target <= 0) return 0;
		if (target == 1) return 1;
		int a = 1;
		int b = 2;
		for (int i = 2; i <= target; i++) {
			b = 2 * a;
			a = b;
		}
		return b;
	}

}

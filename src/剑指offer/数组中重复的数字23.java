package ��ָoffer;

/**
 * �������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
 * @author ilovejava1314
 */
public class �������ظ�������23 {
	/*
	 * ˼·:
	 * 	����һ��boolean���������洢ÿ�������ִ�������һ�γ���
	 * ����Ϊtrue���ڶ��γ��ָ�����ֱ�Ӵ���duplication������true��
	 * boolean������±�Ϊ������ֵ��
	 * -----------------------------------------------
	 * ����ʱ�䣺18ms
	 * ռ���ڴ棺9416k
	 */
	public boolean duplicate(int numbers[],int length,int [] duplication) {
		boolean[] flag = new boolean[length];
		for (int i = 0; i < flag.length; i++) {
			if(flag[numbers[i]]==true) {
				duplication[0]=numbers[i];
				return true;
			}
			flag[numbers[i]]=true;
		}
		return false;
    }

}

package ��ָoffer;

import java.util.Arrays;

/*
 *��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
 *��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}����������2��������
 *������5�Σ��������鳤�ȵ�һ�룬������2����������������0��
 * @author ilovejava1314
 */
public class �����г��ִ�������һ�������28 {

	public static void main(String[] args) {
		int[] array = { 7, 6, 2, 2, 2, 2, 2, 5 };
		System.out.println(MoreThanHalfNum_Solution(array));
	}

	/*
	 * ˼·: ���ȸ������⣬���������������г��ִ�����������һ������ֱض����������м�λ�ó���
	 * ��������ҳ�������ܵ�����ֻ��ͳ�Ƴ������ĸ��������ж��Ƿ���ĳ����˳��ȵ� һ�뼴�ɡ�
	 * -------------------------------------------- 
	 * ����ʱ�䣺15ms
	 * ռ���ڴ棺9220k
	 */
	public static int MoreThanHalfNum_Solution(int[] array) {
		int len = array.length;
		// �߽�
		if (len == 0)
			return 0;
		// ����
		Arrays.sort(array);
		int count = 0;
		//
		for (int i = 0; i < len; i++) {
			if (array[i] == array[len / 2])
				count++;
		}
		if (count > len / 2)
			return array[len / 2];
		return 0;
	}

}

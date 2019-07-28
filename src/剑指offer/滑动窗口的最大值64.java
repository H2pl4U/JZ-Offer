package ��ָoffer;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
  * ����һ������ͻ������ڵĴ�С���ҳ����л�����������ֵ�����ֵ��
  * ���磬�����������{2,3,4,2,6,2,5,1}���������ڵĴ�С3����ô
  * һ������6���������ڣ����ǵ����ֵ�ֱ�Ϊ{4,4,6,6,6,5}�� ���
  * ����{2,3,4,2,6,2,5,1}�Ļ�������������6����
  *  {[2,3,4],2,6,2,5,1}�� {2,[3,4,2],6,2,5,1}�� 
  *  {2,3,[4,2,6],2,5,1}�� {2,3,4,[2,6,2],5,1}��
  *  {2,3,4,2,[6,2,5],1}�� {2,3,4,2,6,[2,5,1]}��
 * @author ilovejava1314
 */
public class �������ڵ����ֵ64 {
	/*
	 * ˼·:
	 * 	��һ��˫�˶��У����е�һ��λ�ñ��浱ǰ���ڵ����ֵ��
	 * �����ڻ���һ��
	 * 1.�жϵ�ǰ���ֵ�Ƿ����
	 * 2.�����ӵ�ֵ�Ӷ�β��ʼ�Ƚϣ������б���С��ֵ����
	 * -------------------------------------------
	 * ����ʱ�䣺16ms
	 * ռ���ڴ棺9328k
	 */
	public ArrayList<Integer> maxInWindows(int[] num, int size) {
		ArrayList<Integer> res = new ArrayList<>();
		if (size == 0)
			return res;
		int begin;
		ArrayDeque<Integer> q = new ArrayDeque<>();
		for (int i = 0; i < num.length; i++) {
			begin = i - size + 1;
			if (q.isEmpty())
				q.add(i);
			else if (begin > q.peekFirst())
				q.pollFirst();

			while ((!q.isEmpty()) && num[q.peekLast()] <= num[i])
				q.pollLast();
			q.add(i);
			if (begin >= 0)
				res.add(num[q.peekFirst()]);
		}
		return res;
	}

}

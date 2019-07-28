package ��ָoffer;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
  * ��εõ�һ���������е���λ����������������ж�����������ֵ��
  * ��ô��λ������������ֵ����֮��λ���м����ֵ�������������
  * �ж���ż������ֵ����ô��λ������������ֵ����֮���м�������
  * ��ƽ��ֵ������ʹ��Insert()������ȡ��������ʹ��GetMedian()
  * ������ȡ��ǰ��ȡ���ݵ���λ����
 * @author ilovejava1314
 */
public class �������е���λ��63 {
	/*
	 * ˼·:
	 * 	���ô�С�����������ݣ������������ѣ�С������С����
	 * ������˼·�ڴ���ע��
	 * -------------------------------------------
	 * ����ʱ�䣺46ms
	 * ռ���ڴ棺9664k
	 */
	private int count = 0;
	private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	private PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(15, new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}
	});
	
	public void Insert(Integer num) {
		if (count %2 == 0) {//����������Ϊż��ʱ���¼����Ԫ�أ�Ӧ������С����
		//��ע�ⲻ��ֱ�ӽ���С���ѣ����Ǿ������ɸѡ��ȡ����������Ԫ�ؽ���С���ѣ�
		//1.�¼����Ԫ�����뵽����ѣ��ɴ����ɸѡ����������Ԫ��
			maxHeap.offer(num);
			int filteredMaxNum = maxHeap.poll();
			//2.ɸѡ��ġ�������е����Ԫ�ء�����С����
			minHeap.offer(filteredMaxNum);
		} else {//����������Ϊ����ʱ���¼����Ԫ�أ�Ӧ����������
			//��ע�ⲻ��ֱ�ӽ������ѣ����Ǿ�С����ɸѡ��ȡС���������Ԫ�ؽ������ѣ�
			//1.�¼����Ԫ�����뵽С���ѣ���С����ɸѡ��������С��Ԫ��
			minHeap.offer(num);
			int filteredMinNum = minHeap.poll();
			//2.ɸѡ��ġ�С�����е���СԪ�ء���������
			maxHeap.offer(filteredMinNum);
		}
		count++;
    }

    public Double GetMedian() {
    	if (count %2 == 0) {
    		return new Double((minHeap.peek() + maxHeap.peek())) / 2;
    	} else {
    		return new Double(minHeap.peek());
    	}
    }
	
}

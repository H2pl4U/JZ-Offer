package ��ָoffer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ���
 * ���磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ����һ��ֻ��
 * ��һ�ε��ַ���"g"�����Ӹ��ַ����ж���ǰ�����ַ���google"ʱ��
 * ��һ��ֻ����һ�ε��ַ���"l"��
 * 
 * ����֪ʶ�㣺 �ַ���
 * @author ilovejava1314
 */
public class �ַ����е�һ�����ظ����ַ�54 {
	/*
	 * ˼·:
	 * 	��һ��256��С������ͳ��ÿ���ַ����ֵĴ���,��������
	 * �洢ÿ���ַ������Ӷ�Ԫ�س��ִ�������1�Σ��ͻ�ɾ������
	 * ��������ֻʣ�³��ִ���Ϊ1��Ԫ�أ��Ӷ�Ԫ�ؾ��ǵ�һ��
	 * ֻ����һ�ε��ַ���
	 * ----------------------------------------------
	 * ����ʱ�䣺17ms
	 * ռ���ڴ棺9592k
	 */
	private int[] cnts = new int[256];
	private Queue<Character> queue = new LinkedList<Character>();
	//Insert one char from stringstream
	public void Insert(char ch){
		cnts[ch]++;
		queue.add(ch);
		while(!queue.isEmpty()&&cnts[queue.peek()]>1) {
			queue.poll();
		}
        
    }
	//return the first appearence once char in current stringstream
    public char FirstAppearingOnce(){
    	if(queue.isEmpty()) return '#';
		return queue.peek();
    }

}

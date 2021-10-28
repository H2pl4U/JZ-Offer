package 剑指offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，第一个只出
 * 现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，
 * 第一个只出现一次的字符是"l"。
 * 
 * 本题知识点： 字符串
 * @author ilovejava1314
 */
public class 字符流中第一个不重复的字符54 {
	/*
	 * 思路:
	 * 	用一个256大小的数组统计每个字符出现的次数,队列用来
	 * 存储每个字符，当队顶元素出现次数超过1次，就会删除它，
	 * 最后队列中只剩下出现次数为1的元素，队顶元素就是第一个
	 * 只出现一次的字符。
	 * ----------------------------------------------
	 * 运行时间：17ms
	 * 占用内存：9592k
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

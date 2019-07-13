package ��ָoffer;

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

/**
 * ����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬
 * һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩
 * ���ؽ��Ϊ���ƺ��������head����ע�⣬��������
 * �벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
 * @author ilovejava1314
 */
public class ��������ĸ���25 {

	/*
	* ˼·:��������ɸ�������ĸ���
	* 1.����ÿһ���ڵ㣬��A>B>C>D,���ƺ��A>A>B>B>C>C>D>D
	* 2.���±������������Ͻ������ָ����½�㣬��A.random = A1.random.next;
	* 3.���������������Ϊԭ����͸��ƺ������
	* 
	* ˼·Դ��ţ������chancy����
	* -------------------------------------------------------
	* ����ʱ�䣺27ms
	* ռ���ڴ棺9600k
	*/
	public RandomListNode Clone(RandomListNode pHead)
    {
		if(pHead==null) return null;
		RandomListNode currentNode = pHead;
		
		//1.����ÿһ���ڵ㣬��A>B>C>D,���ƺ��A>A>B>B>C>C>D>D
		while(currentNode!=null) {
			RandomListNode cloneNode = new RandomListNode(currentNode.label);
			RandomListNode next = currentNode.next;
			currentNode.next=cloneNode;
			cloneNode.next=next;
			currentNode=next;
		}
		currentNode = pHead;
		//2.���±������������Ͻ������ָ����½�㣬��A.random = A1.random.next;
		while(currentNode!=null) {
			currentNode.next.random=currentNode.random==null?null:currentNode.random.next;
			currentNode=currentNode.next.next;
		}
		
		//3.���������������Ϊԭ����͸��ƺ������
		currentNode = pHead;
        RandomListNode pCloneHead = pHead.next;
        while(currentNode!=null) {
        	 RandomListNode cloneNode = currentNode.next;
             currentNode.next = cloneNode.next;
             cloneNode.next = cloneNode.next==null?null:cloneNode.next.next;
             currentNode = currentNode.next;
        }
		return pCloneHead;
    }
	
}

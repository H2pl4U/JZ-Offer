package 剑指offer;

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

/**
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，
 * 一个指向下一个节点，另一个特殊指针指向任意一个节点）
 * 返回结果为复制后复杂链表的head。（注意，输出结果中
 * 请不要返回参数中的节点引用，否则判题程序会直接返回空）
 * @author ilovejava1314
 */
public class 复杂链表的复制25 {

	/*
	* 思路:分三步完成复杂链表的复制
	* 1.复制每一个节点，如A>B>C>D,复制后得A>A>B>B>C>C>D>D
	* 2.重新遍历链表，复制老结点的随机指针给新结点，如A.random = A1.random.next;
	* 3.拆分链表，将链表拆分为原链表和复制后的链表
	* 
	* 思路源于牛客评论chancy大佬
	* -------------------------------------------------------
	* 运行时间：27ms
	* 占用内存：9600k
	*/
	public RandomListNode Clone(RandomListNode pHead)
    {
		if(pHead==null) return null;
		RandomListNode currentNode = pHead;
		
		//1.复制每一个节点，如A>B>C>D,复制后得A>A>B>B>C>C>D>D
		while(currentNode!=null) {
			RandomListNode cloneNode = new RandomListNode(currentNode.label);
			RandomListNode next = currentNode.next;
			currentNode.next=cloneNode;
			cloneNode.next=next;
			currentNode=next;
		}
		currentNode = pHead;
		//2.重新遍历链表，复制老结点的随机指针给新结点，如A.random = A1.random.next;
		while(currentNode!=null) {
			currentNode.next.random=currentNode.random==null?null:currentNode.random.next;
			currentNode=currentNode.next.next;
		}
		
		//3.拆分链表，将链表拆分为原链表和复制后的链表
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

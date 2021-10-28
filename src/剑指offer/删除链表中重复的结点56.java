package 剑指offer;

/**
  * 在一个排序的链表中，存在重复的结点，请删除该链表
  * 中重复的结点，重复的结点不保留，返回链表头指针。 
  * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 * @author ilovejava1314
 */
public class 删除链表中重复的结点56 {
	/*
	 * 思路:
	 * 	递归求解，首先确定出口,当pHead为空或者只有一个
	 * 元素时候返回本身，通过比较当前的值和其next的值来
	 * 删除重复元素，如果出现不相同元素递归其next元素。
	 * -------------------------------------------
	 * 运行时间：22ms
	 * 占用内存：9564k
	 */
	public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead==null||pHead.next==null) return pHead; 
        if(pHead.val==pHead.next.val) {
        	ListNode next = pHead.next;
        	while(next!=null && pHead.val==next.val) {
        		next = next.next;
        	}
        	return deleteDuplication(next);
        }else {
        	pHead.next=deleteDuplication(pHead.next);
        	return pHead;
        }
    }

}

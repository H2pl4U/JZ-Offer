package 剑指offer;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则。
 * @author ilovejava1314
 */
public class 合并两个排序的链表16 {

	public static void main(String[] args) {
		
	}
	
	/*
	 * 思路:递归思想,首先判断链表中是否有空链表，若有则直接返回另一个
	 * 判断两个链表第一个元素大小，若List1小则将List1的第一个元素存入
	 * 新链表中，递归List1.next和List2,反之亦然。
	 * -----------------------------------------------
	 * 运行时间：25ms
	 * 占用内存：9428k
	 */
	public static ListNode Merge(ListNode list1,ListNode list2) {
		if(list1==null) {
			return list2;
		}
		if(list2==null) {
			return list1;
		}
		ListNode pre = null;
		if(list1.val>list2.val) {
			pre=list2;
			pre.next=Merge(list1, list2.next);
		}else {
			pre=list1;
			pre.next=Merge(list1.next, list2);
		}
		return pre;
    }

}

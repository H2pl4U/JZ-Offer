package 剑指offer;


/**
 * 输入两个链表，找出它们的第一个公共结点。
 * 
 * 本题知识点： 链表
 * -------------------------------------------- 
 * @author ilovejava1314
 */
public class 两个链表的第一个公共结点35 {

	/*
	 * 思路:
	 * 		定义两个链表p1,p2分别指向pHead1和pHead2,从头
	 * 节点开始遍历寻找是否为公共节点，若不是各自指向其下一
	 * 个节点，如果此次节点为空，那么从头节点再来，最终两个
	 * 指针到达 null 或者到达公共结点。
	 * 
	 * 牛客评论selfboot
	 * ---------------------------------------------
	 * 运行时间：31ms
	 * 占用内存：9616k
	 */
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		ListNode p1 = pHead1;
		ListNode p2 = pHead2;
		while(p1!=p2) {
			p1=(p1==null?pHead1:p1.next);
			p2=(p2==null?pHead2:p2.next);
		}
		return p1;
    }

}

package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * @author ilovejava1314
 */
public class 从上往下打印二叉树22 {
	/*
	 * 思路:借助一个队列存放相应的二叉树,首先将root入队，
	 * 循环队列，删除并返回root的值，并将此值存入数组
	 * 若root的左子树不为空，那么先将左子树入队，同理
	 * root的右子树不为空，再将右子树入队，依此循环
	 * 直到队列为空(没有左右子树的时候)
	 * -----------------------------------------------
	 * 运行时间：23ms
	 * 占用内存：9184k
	 */
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(root==null) return list;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			//删除并返回
			TreeNode node = queue.poll();
			//数组自顶向下存值
			list.add(node.val);
			//左子树不为空则将左子树入队
			if(node.left!=null) {
				queue.add(node.left);
			}
			//右子树不为空则将右子树入队
			if(node.right!=null) {
				queue.add(node.right);
			}
		}
		return list;
    }

}

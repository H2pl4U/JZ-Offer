package 剑指offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
  *请实现一个函数按照之字形打印二叉树，即第一行按照
  *从左到右的顺序打印，第二层按照从右至左的顺序打印，
  *第三行按照从左到右的顺序打印，其他行以此类推。
  *
  * @author ilovejava1314
  */
public class 按之字形顺序打印二叉树59 {
	/*
	 * 思路:
	 * 	利用队列存储二叉树节点，设置反转值reverse，从根
	 * 节点遍历，从根节点开始存值入list，若有左子树或右
	 * 子树则存入队列中，每两次反转一次list满足题意。
	 * -------------------------------------------
	 * 运行时间：33ms
	 * 占用内存：9532k
	 */
	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if(pRoot==null) return res;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(pRoot);
		boolean reverse = false;
		while(!queue.isEmpty()) {
			int cnt = queue.size();
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < cnt; i++) {
				TreeNode node = queue.poll();
				list.add(node.val);
				if(node.left!=null) queue.add(node.left);
				if(node.right!=null) queue.add(node.right);
			}
			if(reverse) {
				Collections.reverse(list);
				reverse=false;
			}else {
				reverse=true;
			}
			res.add(list);
		}
		return res;
    }

}

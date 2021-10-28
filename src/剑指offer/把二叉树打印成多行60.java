package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
  * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 * @author ilovejava1314
 */
public class 把二叉树打印成多行60 {
	/*
	 * 思路:
	 * 	之字形打印的简化版本，利用队列逐层遍历存值。
	 * -------------------------------------------
	 * 运行时间：23ms
	 * 占用内存：9744k
	 */
	ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if(pRoot==null) return res;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(pRoot);
		while(!queue.isEmpty()) {
			int cnt = queue.size();
			ArrayList<Integer> list = new ArrayList<>();
			for (int i = 0; i < cnt; i++) {
				TreeNode node = queue.poll();
				list.add(node.val);
				if(node.left!=null)  queue.add(node.left);
				if(node.right!=null)  queue.add(node.right);
			}
			res.add(list);
		}
		return res;
    }

}

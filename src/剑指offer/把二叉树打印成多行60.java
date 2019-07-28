package ��ָoffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
  * ���ϵ��°����ӡ��������ͬһ����������������ÿһ�����һ�С�
 * @author ilovejava1314
 */
public class �Ѷ�������ӡ�ɶ���60 {
	/*
	 * ˼·:
	 * 	֮���δ�ӡ�ļ򻯰汾�����ö�����������ֵ��
	 * -------------------------------------------
	 * ����ʱ�䣺23ms
	 * ռ���ڴ棺9744k
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

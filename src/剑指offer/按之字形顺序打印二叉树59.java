package ��ָoffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
  *��ʵ��һ����������֮���δ�ӡ������������һ�а���
  *�����ҵ�˳���ӡ���ڶ��㰴�մ��������˳���ӡ��
  *�����а��մ����ҵ�˳���ӡ���������Դ����ơ�
  *
  * @author ilovejava1314
  */
public class ��֮����˳���ӡ������59 {
	/*
	 * ˼·:
	 * 	���ö��д洢�������ڵ㣬���÷�תֵreverse���Ӹ�
	 * �ڵ�������Ӹ��ڵ㿪ʼ��ֵ��list����������������
	 * �������������У�ÿ���η�תһ��list�������⡣
	 * -------------------------------------------
	 * ����ʱ�䣺33ms
	 * ռ���ڴ棺9532k
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

package ��ָoffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * �������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
 * @author ilovejava1314
 */
public class �������´�ӡ������22 {
	/*
	 * ˼·:����һ�����д����Ӧ�Ķ�����,���Ƚ�root��ӣ�
	 * ѭ�����У�ɾ��������root��ֵ��������ֵ��������
	 * ��root����������Ϊ�գ���ô�Ƚ���������ӣ�ͬ��
	 * root����������Ϊ�գ��ٽ���������ӣ�����ѭ��
	 * ֱ������Ϊ��(û������������ʱ��)
	 * -----------------------------------------------
	 * ����ʱ�䣺23ms
	 * ռ���ڴ棺9184k
	 */
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(root==null) return list;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			//ɾ��������
			TreeNode node = queue.poll();
			//�����Զ����´�ֵ
			list.add(node.val);
			//��������Ϊ�������������
			if(node.left!=null) {
				queue.add(node.left);
			}
			//��������Ϊ�������������
			if(node.right!=null) {
				queue.add(node.right);
			}
		}
		return list;
    }

}

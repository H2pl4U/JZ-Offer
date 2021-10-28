package 二刷;

import java.util.Arrays;

public class 重建二叉树04 {
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if (pre.length == 0 || in.length == 0) return null;
		TreeNode root = new TreeNode(pre[0]);
		// 在中序中找到前序的根
		for (int i = 0;i < in.length;i++) {
			if (in[i] == pre[0]) {
				//左子树，copyOfRange函数，左闭右开
				root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
				//右子树，copyOfRange函数，左闭右开
				root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in, i + 1, in.length));
				break;
			}
		}
		return root;
	}
	
	public TreeNode reConstructBinaryTree2(int[] pre, int[] in) {
		if(pre.length == 0 || in.length == 0) return null;
		TreeNode root = new TreeNode(pre[0]);
		for (int i = 0;i < in.length;i++) {
			if (in[i] == pre[0]) {
				root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));
				root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1, in.length));
				break;
			}
		}
		return root;
	}

}

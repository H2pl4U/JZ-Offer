package 剑指offer;


/**
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依
 * 次经过的结点（含根、叶结点）形成树的一条路径，最
 * 长路径的长度为树的深度。
 * 
 * 本题知识点： 树
 * -------------------------------------------- 
 * @author ilovejava1314
 */
public class 二叉树的深度38 {

	/*
	 * 思路:
	 * 		递归求解，分别记录根节点的左子树中的最大深度
	 * 和根节点的右子树中的最大深度，叶子节点为空，返回0，
	 * 每递归一次，相当于找到了某节点左子树或者右子树，返回1
	 * ---------------------------------------------
	 * 运行时间：21ms
	 * 占用内存：9184k
	 */
	public int TreeDepth(TreeNode root) {
		if(root==null) return 0;
		int right = TreeDepth(root.right);
		int left = TreeDepth(root.left);
		return Math.max(right, left)+1;
    }

}

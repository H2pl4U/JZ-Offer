package 剑指offer;


/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * 
 * 本题知识点： 树
 * -------------------------------------------- 
 * @author ilovejava1314
 */
public class 平衡二叉树39 {

	/*
	 * 思路:
	 * 		递归求解，遍历每个结点，借助一个获取树深度的递归函数，
	 * 根据该结点的左右子树高度差判断是否平衡，然后递归地对左右子
	 * 树进行判断。如果子树是平衡二叉树，则返回子树的高度；如果发
	 * 现子树不是平衡二叉树，则直接停止遍历，这样至多只对每个结点
	 * 访问一次。
	 * ---------------------------------------------
	 * 运行时间：14ms
	 * 占用内存：9416k
	 */
	public boolean IsBalanced_Solution(TreeNode root) {
		return getDepth(root)!=-1;
    }
	
	private int getDepth(TreeNode root) {
		if(root==null) return 0;
		int right = getDepth(root.right);
		if(right==-1) return -1;
		int left = getDepth(root.left);
		if(left==-1) return -1;
		//不平衡返回-1
		return Math.abs(left-right)>1?-1:Math.max(right, left);
	}

}

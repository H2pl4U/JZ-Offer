package 剑指offer;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * @author ilovejava1314
 */
public class 二叉树的镜像18 {

	public static void main(String[] args) {
		
	}
	
	/*
	 * 思路:递归，从根节点开始，交换其左右子树的值
	 * 遍历其左右子树，再交换左右子树的值
	 * -----------------------------------------------
	 * 运行时间：30ms
	 * 占用内存：9576k
	 */
	public void Mirror(TreeNode root) {
        TreeNode temp = null;
        if(root!=null) {
        	temp = root.left;
        	root.left=root.right;
        	root.right=temp;
        	if(root.left!=null) {
        		Mirror(root.left);
        	}
        	if(root.right!=null) {
        		Mirror(root.right);
        	}
        }
    }

}

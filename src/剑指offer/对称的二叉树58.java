package 剑指offer;

/**
  * 请实现一个函数，用来判断一颗二叉树是不是对称的。
  * 注意，如果一个二叉树同此二叉树的镜像是同样的，
  * 定义其为对称的。
 * @author ilovejava1314
 */
public class 对称的二叉树58 {
	/*
	 * 思路:
	 * 	递归求解，从根节点的左右子树开始递归，如果左右子树
	 * 都为空，则返回true，有一个为空则不满足返回false，如
	 * 果左子树的值不等于右子树的值也不满足，返回false，左
	 * 右子树都不为空的话且相等的话，继续遍历其镜像子树，具
	 * 体在最后一行代码注释。
	 * -------------------------------------------
	 * 运行时间：16ms
	 * 占用内存：9436k
	 */
	boolean isSymmetrical(TreeNode pRoot){
		if(pRoot==null) return true;
		return isSymmetrical(pRoot.left,pRoot.right);
    }

	boolean isSymmetrical(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) return true;
	    if (t1 == null || t2 == null) return false;
	    if (t1.val != t2.val) return false;
	    //判断其镜像是否也相等，左的左子树和右的右子树，左的右子树和右的左子树
	    return isSymmetrical(t1.left, t2.right) && isSymmetrical(t1.right, t2.left);
	}
	

}

package 剑指offer;

/**
  * 给定一棵二叉搜索树，请找出其中的第k小的结点。
  * 例如， （5，3，7，2，4，6，8）    中，按结点数
  * 值大小顺序第三小结点的值为4。
 * @author ilovejava1314
 */
public class 二叉搜索树的第k个结点62 {
	/*
	 * 思路:
	 * 	二叉搜索树又名二叉排序树，若它的左子树不空，则左子树上所有
	 * 结点的值均小于它的根结点的值； 若它的右子树不空，则右子树上所
	 * 有结点的值均大于它的根结点的值； 它的左、右子树也分别为二叉排
	 * 序树。按照这个特性问题就很简单了，二叉搜索树按照中序遍历的顺
	 * 序打印出来正好就是排序好的顺序。所以，按照中序遍历顺序找到第
	 * k个结点就是结果。
	 * -------------------------------------------
	 * 运行时间：23ms
	 * 占用内存：9696k
	 */
	int index = 0 ;//计数器
	TreeNode KthNode(TreeNode pRoot, int k){
		if(pRoot != null){ //中序遍历寻找第k个
			TreeNode node = KthNode(pRoot.left,k);
			if(node != null)
				return node;
			index ++;
			if(index == k)
				return pRoot;
			node = KthNode(pRoot.right,k);
			if(node != null)
			    return node;
		}
		return null;
    }
	
}

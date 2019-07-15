package 剑指offer;

import java.util.Stack;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
* @author ilovejava1314
*/
public class 二叉搜索树与双向链表26 {

	/*
	 * 思路:
	 *  1.核心是中序遍历的非递归算法。
	 *  2.修改当前遍历节点与前一遍历节点的指针指向。
	 *  
	 *  思路源于牛客评论nailperry大佬
	 * -----------------------------------------------
	 * 运行时间：30ms
	 * 占用内存：9368k
	 */
	public TreeNode Convert(TreeNode pRootOfTree) {
		if(pRootOfTree==null) return null;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode p = pRootOfTree;
		TreeNode pre = null;	//保存中序遍历序列的上一个节点
		boolean isFirst = true;
		while(p!=null||!stack.isEmpty()) {
			while(p!=null) {
				stack.push(p);
				p=p.left;
			}
			p=stack.pop();
			if(isFirst){
				pRootOfTree = p;// 将中序遍历序列中的第一个节点记为root
	            pre = pRootOfTree;
	            isFirst = false;
	        }else{
	            pre.right = p;
	            p.left = pre;
	            pre = p;
	        }      
	        p = p.right;
		}
		return pRootOfTree;
    }
	
	/*
	 * 思路:利用递归
	 *  1.将左子树构造成双链表，并返回链表头节点。
	 *  2.定位至左子树双链表最后一个节点。
	 *  3.如果左子树链表不为空的话，将当前root追加到左子树链表。
	 *  4.将右子树构造成双链表，并返回链表头节点。
	 *  5.如果右子树链表不为空的话，将该链表追加到root节点之后。
	 *  6.根据左子树链表是否为空确定返回的节点。
	 *  
	 *  思路源于牛客评论nailperry大佬
	 * -----------------------------------------------
	 * 运行时间：22ms
	 * 占用内存：9128k
	 */
	protected TreeNode leftLast = null;
    public TreeNode Convert2(TreeNode root) {
        if(root==null)
            return null;
        if(root.left==null&&root.right==null){
            leftLast = root;// 最后的一个节点可能为最右侧的叶节点
            return root;
        }
        // 1.将左子树构造成双链表，并返回链表头节点
        TreeNode left = Convert(root.left);
        // 3.如果左子树链表不为空的话，将当前root追加到左子树链表
        if(left!=null){
            leftLast.right = root;
            root.left = leftLast;
        }
        leftLast = root;// 当根节点只含左子树时，则该根节点为最后一个节点
        // 4.将右子树构造成双链表，并返回链表头节点
        TreeNode right = Convert(root.right);
        // 5.如果右子树链表不为空的话，将该链表追加到root节点之后
        if(right!=null){
            right.left = root;
            root.right = right;
        }
        return left!=null?left:root;
    }
}

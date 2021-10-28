package 剑指offer;

/**
 * 
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回。
 * @author ilovejava1314
 *
 */

class TreeNode {
   int val;
   TreeNode left;
   TreeNode right;
   TreeNode(int x) { val = x; }
}

public class 重建二叉树04 {

	public static void main(String[] args) {
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		TreeNode root = reConstructBinaryTree(pre, in);
		System.out.println(root.val+" "+root.left.val+" "+root.right.val);

	}
	
	
	/*
	  * 递归思想，每次将左右两颗子树当成新的子树进行处理，中序的左右子树索引好找
	  * 前序的开始结束索引通过计算中序中左右子树的大小来计算，然后递归求解，直到
	 * startPre>endPre||startIn>endIn说明子树处理完毕，方法每次返回做子树和
	  * 右子树的跟节点。
	 * 
	 * -----------------
	  * 运行时间：270ms
	  * 占用内存：23016k
	 */
	public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		//调用前序的开始结束索引通过计算中序中左右子树的大小来计算
		TreeNode root = reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
		return root;
    }

	private static TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
		//判断是否处理完毕
		if(startPre>endPre||startIn>endIn)
			return null;
		TreeNode root = new TreeNode(pre[startPre]);
		for(int i=startIn;i<=endIn;i++) 
			if(in[i]==pre[startPre]) {
				root.left=reConstructBinaryTree(pre, startPre+1, startPre+i-startIn, in, startIn, i-1);
				root.right=reConstructBinaryTree(pre, i-startIn+startPre+1, endPre, in, i+1, endIn);
				break;
			}
		return root;
	}

}

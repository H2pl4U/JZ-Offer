package 剑指offer;

import java.util.ArrayList;

/**
  * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中
  * 结点值的和为输入整数的所有路径。路径定义为从树的
  * 根结点开始往下一直到叶结点所经过的结点形成一条路
  * 径。(注意: 在返回值的list中，数组长度大的数组靠前)
 * @author ilovejava1314
 */
public class 二叉树中和为某一值的路径24 {

   /*
	* 思路:递归求解，若根结点不为空，先将根节点添加至一个数组中，
	*需要求的target减去根节点的值，当满足target正好为0，末尾
	*正好是叶子节点时，说明该路径满足提议，添加至结果，如果不
	*满足那些条件，那么再以它的左子树和右子树分叉寻找，当左子树
	*或右子树满足条件时添加至结果。
	* -----------------------------------------------
	* 运行时间：19ms
	* 占用内存：9560k
	*/
	private ArrayList<ArrayList<Integer>> listAll= new ArrayList<ArrayList<Integer>>();
	private ArrayList<Integer> list = new ArrayList<Integer>();
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		//节点若为空，直接返回结果(递归跳出条件即判断是否为叶子节点)
		if (root==null) return listAll;
		//节点不为空，先将节点存入一条ArrayList中
		list.add(root.val);
		//target(总和)减去此根节点
		target-=root.val;
		//如果满足，总和为0，左右子树不为空，即此路径的和为target且末尾节点为叶子节点
		if(target==0&&root.left==null&&root.right==null) {
			//将此条路径添加至结果集中
			listAll.add(new ArrayList<Integer>(list));
		}
		//寻找这个节点的左子树
		if(root.left!=null)	FindPath(root.left, target);
		//寻找这个节点的右子树
		if(root.right!=null) FindPath(root.right, target);
		//将此路径末尾元素删除,深度遍历完一条路径后要回退
		list.remove(list.size()-1);
		return listAll;
    }

}

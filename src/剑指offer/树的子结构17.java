package 剑指offer;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。
 * (ps：我们约定空树不是任意一个树的子结构)
 * @author ilovejava1314
 */
public class 树的子结构17 {

	public static void main(String[] args) {
		
	}
	
	/*
	 * 思路：利用递归思想，先确定对应Tree2的根节点
	 * 若找到其根节点，则去判断是否为子结构
	 * 若找不到那么再去Tree1跟节点的左子树找，
	 * 要是还找不到再去Tree1跟节点的右子树找，
	 * 返回flag值即可
	 * -----------------------------------
	 * 运行时间：13ms
	 * 占用内存：8980k
	 */
	public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
		boolean flag = false;
		//当Tree1和Tree2都不为零的时候，才进行比较。否则直接返回false
		if(root1!=null&&root2!=null) {
			//如果找到了对应Tree2的根节点的点
			if(root1.val==root2.val) {
				//以这个根节点为为起点判断是否包含Tree2
				flag = doseRoot1HaveRoot2(root1,root2);
			}
			//如果找不到，那么就再去root的左儿子当作起点，去判断时候包含Tree2
			if(!flag) {
				flag = HasSubtree(root1.left, root2);
			}
			//如果找不到，那么就再去root的右儿子当作起点，去判断时候包含Tree2
			if(!flag) {
				flag = HasSubtree(root1.right, root2);
			}
		}
		return flag;
    }

	private static boolean doseRoot1HaveRoot2(TreeNode root1, TreeNode root2) {
		//如果Tree2已经遍历完了都能对应的上，返回true
		if(root2==null) {
			return true;
		}
		 //如果Tree1已经遍历完了但是Tree2却没有遍历完，返回false
		if(root1==null) {
			return false;
		}
		//如果其中有一个点没有对应上，返回false
		if(root1.val!=root2.val) {
			return false;
		}
		//如果根节点对应的上，那么就分别去子节点里面匹配
		return doseRoot1HaveRoot2(root1.left, root2.left)&&doseRoot1HaveRoot2(root1.right, root2.right);
	}

}

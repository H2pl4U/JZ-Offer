package 剑指offer;

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}

/**
  * 
 * @author ilovejava1314
 */
public class 二叉树的下一个结点57 {
	/*
	 * 思路:
	 * 	如果一个节点有右子树不为空，那么该节点的下一个节点是右子树的最左节点；
	 * 	否则，向上找第一个左链接指向的树包含该节点的祖先节点。
	 * -------------------------------------------
	 * 运行时间：32ms
	 * 占用内存：9572k
	 */
	public TreeLinkNode GetNext(TreeLinkNode pNode){
		if (pNode == null) return null;
	    if (pNode.right != null) {
	        pNode = pNode.right;
	        while (pNode.left != null) pNode = pNode.left;
	        return pNode;
	    } else {
	        TreeLinkNode parent = pNode.next;
	        while (parent != null) {
	            if (parent.left == pNode) return parent;
	            pNode = pNode.next;
	            parent = pNode.next;
	        }
	    }
	    return null;
    }

}

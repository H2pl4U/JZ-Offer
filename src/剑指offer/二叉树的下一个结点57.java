package ��ָoffer;

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
public class ����������һ�����57 {
	/*
	 * ˼·:
	 * 	���һ���ڵ�����������Ϊ�գ���ô�ýڵ����һ���ڵ���������������ڵ㣻
	 * 	���������ҵ�һ��������ָ����������ýڵ�����Ƚڵ㡣
	 * -------------------------------------------
	 * ����ʱ�䣺32ms
	 * ռ���ڴ棺9572k
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

package ��ָoffer;

import java.util.Stack;

/**
 * ����һ�ö��������������ö���������ת����һ�������˫������
 * Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
* @author ilovejava1314
*/
public class ������������˫������26 {

	/*
	 * ˼·:
	 *  1.��������������ķǵݹ��㷨��
	 *  2.�޸ĵ�ǰ�����ڵ���ǰһ�����ڵ��ָ��ָ��
	 *  
	 *  ˼·Դ��ţ������nailperry����
	 * -----------------------------------------------
	 * ����ʱ�䣺30ms
	 * ռ���ڴ棺9368k
	 */
	public TreeNode Convert(TreeNode pRootOfTree) {
		if(pRootOfTree==null) return null;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode p = pRootOfTree;
		TreeNode pre = null;	//��������������е���һ���ڵ�
		boolean isFirst = true;
		while(p!=null||!stack.isEmpty()) {
			while(p!=null) {
				stack.push(p);
				p=p.left;
			}
			p=stack.pop();
			if(isFirst){
				pRootOfTree = p;// ��������������еĵ�һ���ڵ��Ϊroot
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
	 * ˼·:���õݹ�
	 *  1.�������������˫��������������ͷ�ڵ㡣
	 *  2.��λ��������˫�������һ���ڵ㡣
	 *  3.�������������Ϊ�յĻ�������ǰroot׷�ӵ�����������
	 *  4.�������������˫��������������ͷ�ڵ㡣
	 *  5.�������������Ϊ�յĻ�����������׷�ӵ�root�ڵ�֮��
	 *  6.���������������Ƿ�Ϊ��ȷ�����صĽڵ㡣
	 *  
	 *  ˼·Դ��ţ������nailperry����
	 * -----------------------------------------------
	 * ����ʱ�䣺22ms
	 * ռ���ڴ棺9128k
	 */
	protected TreeNode leftLast = null;
    public TreeNode Convert2(TreeNode root) {
        if(root==null)
            return null;
        if(root.left==null&&root.right==null){
            leftLast = root;// ����һ���ڵ����Ϊ���Ҳ��Ҷ�ڵ�
            return root;
        }
        // 1.�������������˫��������������ͷ�ڵ�
        TreeNode left = Convert(root.left);
        // 3.�������������Ϊ�յĻ�������ǰroot׷�ӵ�����������
        if(left!=null){
            leftLast.right = root;
            root.left = leftLast;
        }
        leftLast = root;// �����ڵ�ֻ��������ʱ����ø��ڵ�Ϊ���һ���ڵ�
        // 4.�������������˫��������������ͷ�ڵ�
        TreeNode right = Convert(root.right);
        // 5.�������������Ϊ�յĻ�����������׷�ӵ�root�ڵ�֮��
        if(right!=null){
            right.left = root;
            root.right = right;
        }
        return left!=null?left:root;
    }
}

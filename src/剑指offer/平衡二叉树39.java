package ��ָoffer;


/**
 * ����һ�ö��������жϸö������Ƿ���ƽ���������
 * 
 * ����֪ʶ�㣺 ��
 * -------------------------------------------- 
 * @author ilovejava1314
 */
public class ƽ�������39 {

	/*
	 * ˼·:
	 * 		�ݹ���⣬����ÿ����㣬����һ����ȡ����ȵĵݹ麯����
	 * ���ݸý������������߶Ȳ��ж��Ƿ�ƽ�⣬Ȼ��ݹ�ض�������
	 * �������жϡ����������ƽ����������򷵻������ĸ߶ȣ������
	 * ����������ƽ�����������ֱ��ֹͣ��������������ֻ��ÿ�����
	 * ����һ�Ρ�
	 * ---------------------------------------------
	 * ����ʱ�䣺14ms
	 * ռ���ڴ棺9416k
	 */
	public boolean IsBalanced_Solution(TreeNode root) {
		return getDepth(root)!=-1;
    }
	
	private int getDepth(TreeNode root) {
		if(root==null) return 0;
		int right = getDepth(root.right);
		if(right==-1) return -1;
		int left = getDepth(root.left);
		if(left==-1) return -1;
		//��ƽ�ⷵ��-1
		return Math.abs(left-right)>1?-1:Math.max(right, left);
	}

}

package ��ָoffer;

/**
 * ���������Ķ�����������任ΪԴ�������ľ���
 * @author ilovejava1314
 */
public class �������ľ���18 {

	public static void main(String[] args) {
		
	}
	
	/*
	 * ˼·:�ݹ飬�Ӹ��ڵ㿪ʼ������������������ֵ
	 * �����������������ٽ�������������ֵ
	 * -----------------------------------------------
	 * ����ʱ�䣺30ms
	 * ռ���ڴ棺9576k
	 */
	public void Mirror(TreeNode root) {
        TreeNode temp = null;
        if(root!=null) {
        	temp = root.left;
        	root.left=root.right;
        	root.right=temp;
        	if(root.left!=null) {
        		Mirror(root.left);
        	}
        	if(root.right!=null) {
        		Mirror(root.right);
        	}
        }
    }

}

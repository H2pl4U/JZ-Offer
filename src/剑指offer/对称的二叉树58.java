package ��ָoffer;

/**
  * ��ʵ��һ�������������ж�һ�Ŷ������ǲ��ǶԳƵġ�
  * ע�⣬���һ��������ͬ�˶������ľ�����ͬ���ģ�
  * ������Ϊ�ԳƵġ�
 * @author ilovejava1314
 */
public class �ԳƵĶ�����58 {
	/*
	 * ˼·:
	 * 	�ݹ���⣬�Ӹ��ڵ������������ʼ�ݹ飬�����������
	 * ��Ϊ�գ��򷵻�true����һ��Ϊ�������㷵��false����
	 * ����������ֵ��������������ֵҲ�����㣬����false����
	 * ����������Ϊ�յĻ�����ȵĻ������������侵����������
	 * �������һ�д���ע�͡�
	 * -------------------------------------------
	 * ����ʱ�䣺16ms
	 * ռ���ڴ棺9436k
	 */
	boolean isSymmetrical(TreeNode pRoot){
		if(pRoot==null) return true;
		return isSymmetrical(pRoot.left,pRoot.right);
    }

	boolean isSymmetrical(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) return true;
	    if (t1 == null || t2 == null) return false;
	    if (t1.val != t2.val) return false;
	    //�ж��侵���Ƿ�Ҳ��ȣ�������������ҵ���������������������ҵ�������
	    return isSymmetrical(t1.left, t2.right) && isSymmetrical(t1.right, t2.left);
	}
	

}

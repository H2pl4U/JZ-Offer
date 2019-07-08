package ��ָoffer;

/**
 * 
 * ����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
 * ���������ǰ���������������Ľ���ж������ظ������֡�
 * ��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}��
 * ���ؽ������������ء�
 * @author ilovejava1314
 *
 */

class TreeNode {
   int val;
   TreeNode left;
   TreeNode right;
   TreeNode(int x) { val = x; }
}

public class �ؽ�������04 {

	public static void main(String[] args) {
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		TreeNode root = reConstructBinaryTree(pre, in);
		System.out.println(root.val+" "+root.left.val+" "+root.right.val);

	}
	
	
	/*
	  * �ݹ�˼�룬ÿ�ν������������������µ��������д������������������������
	  * ǰ��Ŀ�ʼ��������ͨ���������������������Ĵ�С�����㣬Ȼ��ݹ���⣬ֱ��
	 * startPre>endPre||startIn>endIn˵������������ϣ�����ÿ�η�����������
	  * �������ĸ��ڵ㡣
	 * 
	 * -----------------
	  * ����ʱ�䣺270ms
	  * ռ���ڴ棺23016k
	 */
	public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		//����ǰ��Ŀ�ʼ��������ͨ���������������������Ĵ�С������
		TreeNode root = reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
		return root;
    }

	private static TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
		//�ж��Ƿ������
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

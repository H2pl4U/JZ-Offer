package ��ָoffer;

/**
 * �������ö�����A��B���ж�B�ǲ���A���ӽṹ��
 * (ps������Լ��������������һ�������ӽṹ)
 * @author ilovejava1314
 */
public class �����ӽṹ17 {

	public static void main(String[] args) {
		
	}
	
	/*
	 * ˼·�����õݹ�˼�룬��ȷ����ӦTree2�ĸ��ڵ�
	 * ���ҵ�����ڵ㣬��ȥ�ж��Ƿ�Ϊ�ӽṹ
	 * ���Ҳ�����ô��ȥTree1���ڵ���������ң�
	 * Ҫ�ǻ��Ҳ�����ȥTree1���ڵ���������ң�
	 * ����flagֵ����
	 * -----------------------------------
	 * ����ʱ�䣺13ms
	 * ռ���ڴ棺8980k
	 */
	public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
		boolean flag = false;
		//��Tree1��Tree2����Ϊ���ʱ�򣬲Ž��бȽϡ�����ֱ�ӷ���false
		if(root1!=null&&root2!=null) {
			//����ҵ��˶�ӦTree2�ĸ��ڵ�ĵ�
			if(root1.val==root2.val) {
				//��������ڵ�ΪΪ����ж��Ƿ����Tree2
				flag = doseRoot1HaveRoot2(root1,root2);
			}
			//����Ҳ�������ô����ȥroot������ӵ�����㣬ȥ�ж�ʱ�����Tree2
			if(!flag) {
				flag = HasSubtree(root1.left, root2);
			}
			//����Ҳ�������ô����ȥroot���Ҷ��ӵ�����㣬ȥ�ж�ʱ�����Tree2
			if(!flag) {
				flag = HasSubtree(root1.right, root2);
			}
		}
		return flag;
    }

	private static boolean doseRoot1HaveRoot2(TreeNode root1, TreeNode root2) {
		//���Tree2�Ѿ��������˶��ܶ�Ӧ���ϣ�����true
		if(root2==null) {
			return true;
		}
		 //���Tree1�Ѿ��������˵���Tree2ȴû�б����꣬����false
		if(root1==null) {
			return false;
		}
		//���������һ����û�ж�Ӧ�ϣ�����false
		if(root1.val!=root2.val) {
			return false;
		}
		//������ڵ��Ӧ���ϣ���ô�ͷֱ�ȥ�ӽڵ�����ƥ��
		return doseRoot1HaveRoot2(root1.left, root2.left)&&doseRoot1HaveRoot2(root1.right, root2.right);
	}

}

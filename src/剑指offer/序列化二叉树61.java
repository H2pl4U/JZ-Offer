package ��ָoffer;

/**
 * ��ʵ�������������ֱ��������л��ͷ����л�������
 * @author ilovejava1314
 */
public class ���л�������61 {
	/*
	 * ˼·:
	 * 	���ڵ���ȷ��������������������������л�
	 * �������������ؿգ�������ƴ���ַ�����
	 * ----------------------------------
	 * ����ʱ�䣺29ms
	 * ռ���ڴ棺9688k
	 */
	private String serializeString = "";
	String Serialize(TreeNode root) {
		if (root == null) return "#";
	    return root.val + " " + Serialize(root.left) + " "
	        + Serialize(root.right);
	}
	
	TreeNode Deserialize(String str) {
		this.serializeString=str;
		return Deserialize();
	}

	private TreeNode Deserialize() {
		if (this.serializeString.length() == 0) return null;
	    int idx = this.serializeString.indexOf(" ");
	    if (idx == -1) return null;
	    //ƴ���ַ���
	    String sub = this.serializeString.substring(0, idx);
	    this.serializeString = this.serializeString.substring(idx + 1);
	    if (sub.equals("#")) {
	        return null;
	    }
	    int val = Integer.valueOf(sub);
	    TreeNode t = new TreeNode(val);
	    t.left = Deserialize();
	    t.right = Deserialize();
	    return t;
	}

}

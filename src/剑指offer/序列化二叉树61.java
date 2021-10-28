package 剑指offer;

/**
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 * @author ilovejava1314
 */
public class 序列化二叉树61 {
	/*
	 * 思路:
	 * 	根节点已确定，从其左右子树遍历求出序列化
	 * 不满足条件返回空，满足则拼接字符串。
	 * ----------------------------------
	 * 运行时间：29ms
	 * 占用内存：9688k
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
	    //拼接字符串
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

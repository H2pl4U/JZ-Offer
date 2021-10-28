package 剑指offer;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * @author ilovejava1314
 */
public class 数组中重复的数字23 {
	/*
	 * 思路:
	 * 	创建一个boolean数组用来存储每个数出现次数，第一次出现
	 * 就置为true，第二次出现该数，直接存入duplication并返回true，
	 * boolean数组的下标为各个数值。
	 * -----------------------------------------------
	 * 运行时间：18ms
	 * 占用内存：9416k
	 */
	public boolean duplicate(int numbers[],int length,int [] duplication) {
		boolean[] flag = new boolean[length];
		for (int i = 0; i < flag.length; i++) {
			if(flag[numbers[i]]==true) {
				duplication[0]=numbers[i];
				return true;
			}
			flag[numbers[i]]=true;
		}
		return false;
    }

}

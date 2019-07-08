package 剑指offer;


/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author ilovejava1314
 */
public class 变态跳台阶09 {

	public static void main(String[] args) {
		System.out.println(JumpFloorII(5));
	}
	
	/*
	 * 找规律发现 1 2 4 8 16 ...
	 * 这就变得很简单了，这里就简单的用Math.pow()实现2的n-1次方了。
	 */
	public static int JumpFloorII(int target) {
		return (int) Math.pow(2,target-1);
    }
	
	/*
	 * 思路二:
	 */
	public static int jumpFloor(int target) {
		if (target <= 0) return 0;
		if (target == 1) return 1;
		int a = 1;
		int b = 2;
		for (int i = 2; i <= target; i++) {
			b = 2 * a;
			a = b;
		}
		return b;
	}

}

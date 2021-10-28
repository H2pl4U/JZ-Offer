package 剑指offer;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法
 * （先后次序不同算不同的结果）。
 * @author ilovejava1314
 */
public class 跳台阶08 {

	public static void main(String[] args) {
		System.out.println(JumpFloor(4));
	}
	
	/*
	 * 递归思想
	 * ---------------------------------------
	  * 运行时间：605ms
	  * 占用内存：9200k
	 */
	public static int JumpFloor(int target) {
		if(target==1) return 1;
		else if(target==2) return 2;
		else return JumpFloor(target-1)+JumpFloor(target-2);

    }
	
	/*
	 * 思路:
	 * 类似于斐波拉契数列，首先明白一级台阶有1种跳法，二级台阶有2种跳法
	 * 三级台阶可以从一级台阶跳上来也可以从二级台阶跳上来，
	 * 即等于一级台阶跳法数量加上二级台阶跳法数量，依此类推可得出
	 * n级台阶共有n-2级台阶跳法数与n-1级台阶跳法数之和
	 * 1 2 3 5 8 13 ...
	 * 这不正是斐波拉契数列吗？
	 * ---------------------------------------
	  * 运行时间：20ms
	  * 占用内存：9436k
	 */
	public static int JumpFloor2(int target) {
		if(target==1||target==2) return target;
		int fn1=1,fn2=2,sum=0;
		while(target>2) {
			sum=fn1+fn2;
			fn1=fn2;
			fn2=sum;
			target--;
		}
		return sum;
	}
}

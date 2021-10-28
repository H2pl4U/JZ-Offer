package 二刷;

public class 变态跳台阶09 {

	// ac
	public static int BTJumpFloor(int target) {
		return (int) Math.pow((double) 2, (double) (target - 1));
	}

	// ac
	public static int BTJumpFloor2(int target) {
		if (target <= 0)
			return 0;
		if (target == 1)
			return 1;
		int a = 1;
		int b = 2;
		for (int i = 2; i <= target; i++) {
			b = 2 * a;
			a = b;
		}
		return b;
	}
}

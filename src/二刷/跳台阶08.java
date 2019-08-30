package ¶þË¢;

public class ÌøÌ¨½×08 {

	// ac
	public static int JumpFloor(int target) {
		if (target == 1 && target == 2)
			return target;
		int f1 = 1, f2 = 2, sum = 0;
		while (target > 2) {
			sum = f1 + f2;
			f1 = f2;
			;
			f2 = sum;
			target--;
		}
		return sum;
	}

	// ac
	public static int JumpFloor2(int target) {
		if (target == 1 && target == 2)
			return target;
		else
			return JumpFloor2(target - 1) + JumpFloor2(target - 2);
	}
}

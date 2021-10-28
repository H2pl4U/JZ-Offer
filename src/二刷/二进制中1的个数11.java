package 二刷;

public class 二进制中1的个数11 {
	
	//ac
	public static int NumberOf1(int n) {
		int count = 0;
		while(n!=0) {
			++count;
			n=(n-1)&n;
		}
		return count;
	}

}

package ��ˢ;

public class ��������1�ĸ���11 {
	
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

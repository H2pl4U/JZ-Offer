package 二刷;

public class 斐波拉契数列07 {
	//ac
	public static int Fibonacci(int n) {
		if(n<=1) return n;
		else return Fibonacci(n-1)+Fibonacci(n-2);
	}
	
	//ac
	public static int Fibonacci2(int n) {
		int a=1,b=1,c=0,i=0;
		while(i<n) {
			a=b;
			b=b+c;
			c=a;
			i++;
		}
		return c;
	}

}

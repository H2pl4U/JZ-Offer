package 剑指offer;


/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，
 * 请你输出斐波那契数列的第n项（从0开始，第0项为0）。n<=39
 * @author ilovejava1314
 */
public class 斐波拉契数列07 {

	public static void main(String[] args) {
		System.out.println(Fibonacci2(3));
	}
	
	/*
	 * 思路: 观察1 1 2 3 5 8 13
	 * 发现从第三项开始，第三项的值为前两项的和。
	 * 由此想出通过中间变量，让数列累加，
	 * a的初始位置在第一项,b的初始位置在第二项
	 * 累加时，给a赋值b，b进行累加c，c再赋值a；
	 * 相当于c保持a未赋值时候的值，即可完成正常累加
	 * ---------------------------------------
	  * 运行时间：15ms
	  * 占用内存：9160k
	 */
	public static int Fibonacci(int n) {
		int a=1,b=1,c=0,i=0;
		while(i<n) {
			a=b;
			b=b+c;
			c=a;
			i++;
		}
		return c;
    }
	
	/*
	 *递归思路
	 * ---------------------------------------
	 * 运行时间：1236ms
	 * 占用内存：9416k
	 */
	public static int Fibonacci2(int n) {
		if(n<=1) return n;
		else return Fibonacci2(n-1)+Fibonacci2(n-2);
	}

}

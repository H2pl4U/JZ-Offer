package 剑指offer;


/**
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、
 * else、switch、case等关键字及条件判断语句（A?B:C）。
 * 
 * 本题知识点： 进制转化
 * @author ilovejava1314
 */
public class 求1加到n的和47 {
	public static void main(String[] args) {
		System.out.println(Sum_Solution(10));
	}
	
	/*
	 * 思路:
	 * 本题使用循环或递归都很好求解，但是根据要求，循环不可用，
	 * 递归又缺少跳出条件，利用短路与解决办法，左边的条件为false
	 * 直接下一行，即可以找到递归的跳出条件，问题就解决了。
	 * -----------------------------------------------
	 * 运行时间：15ms
	 * 占用内存：9280k
	 */
	public static int Sum_Solution(int n) {
		int res =0,a=1;
		boolean f = ((n!=0)&&a==(res=Sum_Solution(n-1)));
		res+=n;
		return res;
    }

}

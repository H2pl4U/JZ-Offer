package 剑指offer;

/**
  * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * @author ilovejava1314
 */
public class 二进制中1的个数11 {

	public static void main(String[] args) {
		System.out.println(NumberOf1_(-2147483648));
	}
	
	/*
	 * 思路:
	 * 针对正数和负数，编写不同的方案，
	 * 正数的话，判断每次除2后为奇数还是偶数，若为奇数1的个数++，否则不管
	 * 负数需要补码，补码的运算方法为int的最大值+1减去负数的绝对值，
	 * 再利用正数求1个数的方法求出即可
	 * ------------------------
	  * 运行时间：18ms
	  * 占用内存：9312k
	 */
	public static int NumberOf1(int n) {
		int sum=0;
		if(n>=0) {
			while(n>0) {
				if(n==0) break;
				else if(n==1) {
					sum++;
					break;
				}
				if(n%2==1) sum++;
				n/=2;
			}
			return sum;
		}else {
			n=2147483647+n+1;
			while(n>0) {
				if(n==0) break;
				else if(n==1) {
					sum++;
					break;
				}
				if(n%2==1) sum++;
				n/=2;
			}
			return ++sum;
		}
    }
	
	/*
	 * 如果一个整数不为0，那么这个整数至少有一位是1。
	 * 如果我们把这个整数减1，那么原来处在整数最右边的1就会变为0，
	 * 原来在1后面的所有的0都会变成1(如果最右边的1后面还有0的话)。
	 * 其余所有位将不会受到影响。
	 * ------------------------
	  * 运行时间：14ms
	  * 占用内存：9160k
	 */
	public static int NumberOf1_(int n) {
		   int count = 0;
		   while (n != 0) {
		       ++count;
		       n = (n - 1) & n;
		   }
		   return count;
	}

}

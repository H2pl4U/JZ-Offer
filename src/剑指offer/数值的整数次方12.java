package 剑指offer;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * @author ilovejava1314
 */
public class 数值的整数次方12 {

	public static void main(String[] args) {
		System.out.println(Power2(2, 3));
	}
	
	/*
	 * 思路:使用Math的求次方函数。
	 * ------------------------
	  * 运行时间：69ms
	  * 占用内存：10332k
	 */
	public static double Power(double base, int exponent) {
		return Math.pow(base, exponent);
	}
	
	/*
	 * 思路:递归求解，区别次方幂与被次方数的各种情况，
	 * 并且分别不同情况求不同情况的解。
	 * ------------------------
	  * 运行时间：57ms
	  * 占用内存：10380k
	 */
	public static double Power2(double base, int exponent) {
		//任何数的0次幂  结果为1
		if(exponent==0 && base != 0) return 1;
		//任何数的1次幂  结果为其本身
		if(exponent==1) return base;
		//0的负数次方即会报错，0不能做分母
		if(exponent<=0 && base == 0) {
			throw new RuntimeException();
		}
		//0的任何整数次方还是0
		if(exponent>0 && base == 0) return 0;
		//符合正常条件时候，n取幂的绝对值
		int n = exponent;
		if(exponent<0) {
			n=-exponent;
		}
		//递归，求出base的(n/2)次方
		double result = Power2(base, n>>1);
		result*=result;
		//奇偶性判断，若为奇数
		if((n&1)==1) result*=base;
		//若幂为负数，取结果的倒数
		if(exponent<0) result=1/result;
		return result;
	}

}

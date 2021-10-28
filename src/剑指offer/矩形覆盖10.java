package 剑指offer;


/**
 * 我们可以用2x1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2x1的小矩形无重叠地覆盖一个2xn的大矩形，总共有多少种方法？
 * @author ilovejava1314
 */
public class 矩形覆盖10 {

	public static void main(String[] args) {
		System.out.println(RectCover(5));
	}
	
	/*
	 * 找到规律 1 2 3 5 8 13
	 * 与跳台阶一样，思路也与其相同
	 * ------------------------
	 * 运行时间：22ms
	 * 占用内存：9216k
	 */
	public static int RectCover(int target) {
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

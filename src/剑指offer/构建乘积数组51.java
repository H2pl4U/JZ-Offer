package 剑指offer;

/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中
 * 的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 * 
 * @author ilovejava1314
 */
public class 构建乘积数组51 {
	
	public static void main(String[] args) {
		int[] res = {1,2,3,4,5,6};
		res = multiply(res);
		for (int i : res) {
			System.out.println(i);
		}
	}
	/*
	 * 思路:
	 * 	拿上述例子{1，2，3，4，5}
	 *  结果应该是 res[1]= 1 * 2 * 3 * 4 * 5
	 *  		res[2]= 1 * 1 * 3 * 4 * 5
	 *  		res[3]= 1 * 2 * 1 * 4 * 5
	 *  		res[4]=	1 * 2 * 3 * 1 * 5
	 *  		res[5]=	1 * 2 * 3 * 4 * 1
	 * 找出规律，对角线被1切成上下两个三角形，这样就可以
	 * 分别对这两个三角形累乘即可得出答案
	 * -----------------------------------------------
	 * 运行时间：16ms
	 * 占用内存：9436k
	 */
	public static int[] multiply(int[] A) {
		int length = A.length;
		if(length==0) return A;
		int[] res = new int[length];
		//下三角
		res[0]=1;
		for (int i = 1; i < length; i++) {
			res[i]=A[i-1]*res[i-1];
		}
		//上三角
		int temp = 1;
		for (int i = length-2; i >= 0; i--) {
			temp*=A[i+1];
			res[i]*=temp;
		}
		return res;
    }

}

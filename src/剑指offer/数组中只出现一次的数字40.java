package 剑指offer;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。
 * 请写程序找出这两个只出现一次的数字。
 * @author ilovejava1314
 */
public class 数组中只出现一次的数字40 {

	
	/*
	 * 思路:如果能够把原数组分为两个子数组。在每个子数组中，包
	 * 含一个只出现一次的数字，而其它数字都出现两次。如果能够
	 * 这样拆分原数组，按照前面的办法就是分别求出这两个只出现
	 * 一次的数字了。我们还是从头到尾依次异或数组中的每一个数
	 * 字，那么最终得到的结果就是两个只出现一次的数字的异或结
	 * 果。因为其它数字都出现了两次，在异或中全部抵消掉了。由
	 * 于这两个数字肯定不一样，那么这个异或结果肯定不为0 ，也就
	 * 是说在这个结果数字的二进制表示中至少就有一位为1 。我们在
	 * 结果数字中找到第一个为1 的位的位置，记为第N 位。现在我们
	 * 以第N 位是不是1 为标准把原数组中的数字分成两个子数组，第
	 * 一个子数组中每个数字的第N 位都为1 ，而第二个子数组的每个
	 * 数字的第N 位都为0 。现在我们已经把原数组分成了两个子数组，
	 * 每个子数组都包含一个只出现一次的数字，而其它数字都出现了两次。
	 * 
	 * 参考剑指offer解析书籍
	 * -----------------------------------------------
	 * 运行时间：21ms
	 * 占用内存：9592k
	 */
	public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array.length<2||array==null) return;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
			temp ^= array[i];
		}
        int firstNum = findFirstNum(temp);
        for (int i = 0; i < array.length; i++) {
			if(isBit(array[i],firstNum)) {
				num1[0] ^=array[i];
			}else {
				num2[0] ^=array[i];
			}
		}
    }

	private boolean isBit(int num, int firstNum) {
		num = num >> firstNum;
		return (num & 1)==1;
	}

	private int findFirstNum(int temp) {
		int index = 0 ;
		while(((temp&1)==0)&&index<32) {
			temp = temp>>1;
			++index;
		}
		return index;
	}

}

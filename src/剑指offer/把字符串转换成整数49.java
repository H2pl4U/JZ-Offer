package 剑指offer;


/**
 * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，
 * 但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的
 * 库函数。 数值为0或者字符串不是一个合法的数值则返回0。
 * 
 * 本题知识点：字符串  进制转化
 * @author ilovejava1314
 */
public class 把字符串转换成整数49 {
	public static void main(String[] args) {
		
	}
	
	/*
	 * 思路:
	 * 	首先将字符串转换成字符数组，负号记录1，循环字符数组
	 * 如果字符AsicII编码不在0-9之间直接返回0，满足要求的字符
	 * 在当前sum*10+当前数字。
	 * -----------------------------------------------
	 * 运行时间：20ms
	 * 占用内存：9080k
	 */
	public int StrToInt(String str) {
		if (str.equals("") || str.length() == 0)
            return 0;
        char[] a = str.toCharArray();
        int fuhao = 0;
        if (a[0] == '-')
            fuhao = 1;
        int sum = 0;
        for (int i = fuhao; i < a.length; i++)
        {
            if (a[i] == '+')
                continue;
            if (a[i] < 48 || a[i] > 57)
                return 0;
            sum = sum * 10 + a[i] - 48;
        }
        return fuhao == 0 ? sum : sum * -1;
    }

}

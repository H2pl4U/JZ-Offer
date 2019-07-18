package 剑指offer;

/**
 * 求出1~13的整数中1出现的次数,并算出100~1300的
 * 整数中1出现的次数？为此他特别数了一下1~13中包
 * 含1的数字有1、10、11、12、13因此共出现6次,但
 * 是对于后面问题他就没辙了。ACMer希望你们帮帮他,
 * 并把问题更加普遍化,可以很快的求出任意非负整数区
 * 间中1出现的次数（从1 到 n 中1出现的次数）。
 * @author ilovejava1314
 */
public class 整数中1出现的次数31 {

	public static void main(String[] args) {
		System.out.println(NumberOf1Between1AndN_Solution(13));
		System.out.println(NumberOf1Between1AndN_Solution2(13));
	}
	
	/*
	* 思路:
	* 	归纳出个位出现1的个数n/10 * 1+(n%10!=0 ? 1 : 0)
	* 		   十位出现1的个数
	* (n / 100) * 10 + (if(k > 19) 10 else if(k < 10) 0 else k - 10 + 1)
	* 		   百万出现1的个数
	* (n / 1000) * 100 + (if(k >199) 100 else if(k < 100) 0 else k - 100 + 1)
	* 把个位数上算1的个数的式子也纳入归纳式中
	* n / 10 * 1 + (if(k > 1) 1 else if(k < 1) 0 else k - 1 + 1)
	* 从10到10的n次方的归纳
	* count(i) = (n / (i * 10)) * i + (if(k > i * 2 - 1) 
	* i else if(k < i) 0 else k - i + 1)
	* sum1 = sum(count(i))，i = Math.pow(10, j), 0<=j<=log10(n)
	* 但是有一个地方值得我们注意的，就是代码的简洁性来看，
	* 有多个ifelse不太好，能不能进一步简化呢？ 我们可以把
	* 后半段简化成这样，我们不去计算i * 2 - 1了，我们只需
	* 保证k - i + 1在[0, i]区间内就行了，最后后半段可以写成这样
	* min(max((n mod (i*10))−i+1,0),i)
	* -------------------------------------------------------
	* 运行时间：19ms
	* 占用内存：9324k
	*/
	public static int NumberOf1Between1AndN_Solution(int n) {
        if(n <= 0)
            return 0;
        int count = 0;
        for(long i = 1; i <= n; i *= 10){
            long diviver = i * 10;          
            count += (n / diviver) * i + Math.min(Math.max(n % diviver - i + 1, 0), i);
       }
        return count;
    }
	
	
	/*
	* 思路:
	* 常规思路，每次遍历将n转换为string，再转换成char数组
	* 遍历char数组，只要有1，计数++。
	* -------------------------------------------------------
	* 运行时间：40ms
	* 占用内存：9662k
	*/
	public static int NumberOf1Between1AndN_Solution2(int n) {
		int count=0;
	    while(n>0){
	        String str=String.valueOf(n);
	        char [] chars=str.toCharArray();
	        for(int i=0;i<chars.length;i++){
	            if(chars[i]=='1')
	                count++;
	        }
	        n--;
	    }
	    return count;
	}
}

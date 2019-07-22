package 剑指offer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然
 *有2个大王,2个小王(一副牌原本是54张^_^)...他随机从中抽出
 *了5张牌,想测测自己的手气,看看能不能抽到顺子,如果抽到的
 *话,他决定去买体育彩票,嘿嘿！！“红心A,黑桃3,小王,大王,方
 *片5”,“Oh My God!”不是顺子.....LL不高兴了,他想了想,决定
 *大\小 王可以看成任何数字,并且A看作1,J为11,Q为12,K为13。
 *上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),
 *“So Lucky!”。LL决定去买体育彩票啦。 现在,要求你使用这
 *幅牌模拟上面的过程,然后告诉我们LL的运气如何， 如果牌能
 *组成顺子就输出true，否则就输出false。为了方便起见,你
 *可以认为大小王是0。
 * 
 * 本题知识点： 字符串
 * --------------------------------------------
 * @author ilovejava1314
 */
public class 扑克牌顺子45 {	
	public static void main(String[] args) {
		int [] numbers = {1,3,6,0,0};
		System.out.println(isContinuous(numbers));
	}
	
	 /*
	  * 思路:
	  * 大小王为任意牌，有四张大小王，因此最多能抽到四张，
	  * 而最少一张都没，首先先将数组排序，循环数组，大小王
	  * 个数用count记录，其他牌用ArrayList记录，根据大
	  * 小王个数有五种情况，若有四张则直接返回true，如果
	  * 大小王个数有1，2，3张时，只需满足最大值减去最小
	  * 值小于等于4即可返回true，而没有大小王时，必须满足最大值减
	  * 去最小值等于4才能返回true，其他情况返回false
	  * 	
	  *----------------------------------
	  * 运行时间：14ms
	  * 占用内存：9236k
	 */
	public static boolean isContinuous(int [] numbers) {
		if(numbers.length!=5) return false;
		//排序
		Arrays.sort(numbers);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]==0) {
				count++;
			}else {
				if(list.contains(numbers[i])) {
					return false;
				}
				list.add(numbers[i]);
			}
		}
		if(count==4) return true;
		if(count==3) {
			if(list.get(1)-list.get(0)<=4)
				return true;
		}
		if(count==2) {
			if(list.get(2)-list.get(0)<=4)
				return true;
		}
		if(count==1) {
			if(list.get(3)-list.get(0)<=4)
				return true;
		}
		if(count==0) {
			if(list.get(4)-list.get(0)==4)
				return true;
		}
		return false;
    }


	
}

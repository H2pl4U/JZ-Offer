package 剑指offer;

import java.util.ArrayList;

/**
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,
 * 他马上就写出了正确答案是100。但是他并不满足于此,他在想究
 * 竟有多少种连续的正数序列的和为100(至少包括两个数)。没多久,
 * 他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在
 * 把问题交给你,你能不能也很快的找出所有和为S的连续正数序列?
 *  Good Luck!
 * 
 * 本题知识点： 穷举
 * --------------------------------------------
 * @author ilovejava1314
 */
public class 和为S的连续正数序列41 {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer> > res = new ArrayList<ArrayList<Integer>>();
		res = FindContinuousSequence(100);
		for (ArrayList<Integer> arrayList : res) {
			for (Integer a : arrayList) {
				System.out.println(a);
			}
			System.out.println("--------------");
		}
	}
	
	
	 /*
	  * 思路:
	  * 	常规思路，双重for循环，外层控制起点位置
	  * 内层查找连续正数和为sum的序列，若大于sum直接跳
	  * 出内循环，等于则将list序列存入结果集中。
	  *----------------------
	  * 运行时间：22ms
	  * 占用内存：9300k
	 */
	public static  ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer> > res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(sum<=0) return res;
		int num = 0;
		//起点
		for (int i = 1; i < sum/2+1; i++) {
			num=0;
			//刷新list
			list = new ArrayList<Integer>();
			//查找连续正数序列和为sum
			for (int j = i; j < sum; j++) {
				num+=j;
				if(num==sum) {
					res.add(list);		//等于sum将list存入结果集
				}else if(num>sum){		//大于sum直接跳出内循环
					break;
				}
				list.add(j);
			}
		}
		return res;
    }
}

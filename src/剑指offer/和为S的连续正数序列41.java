package ��ָoffer;

import java.util.ArrayList;

/**
 * С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,
 * �����Ͼ�д������ȷ����100�����������������ڴ�,�����뾿
 * ���ж������������������еĺ�Ϊ100(���ٰ���������)��û���,
 * ���͵õ���һ������������Ϊ100������:18,19,20,21,22������
 * �����⽻����,���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������?
 *  Good Luck!
 * 
 * ����֪ʶ�㣺 ���
 * --------------------------------------------
 * @author ilovejava1314
 */
public class ��ΪS��������������41 {

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
	  * ˼·:
	  * 	����˼·��˫��forѭ�������������λ��
	  * �ڲ��������������Ϊsum�����У�������sumֱ����
	  * ����ѭ����������list���д��������С�
	  *----------------------
	  * ����ʱ�䣺22ms
	  * ռ���ڴ棺9300k
	 */
	public static  ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer> > res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(sum<=0) return res;
		int num = 0;
		//���
		for (int i = 1; i < sum/2+1; i++) {
			num=0;
			//ˢ��list
			list = new ArrayList<Integer>();
			//���������������к�Ϊsum
			for (int j = i; j < sum; j++) {
				num+=j;
				if(num==sum) {
					res.add(list);		//����sum��list��������
				}else if(num>sum){		//����sumֱ��������ѭ��
					break;
				}
				list.add(j);
			}
		}
		return res;
    }
}

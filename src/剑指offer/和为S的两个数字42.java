package ��ָoffer;

import java.util.ArrayList;

/**
 * ����һ����������������һ������S���������в�����������
 * ʹ�����ǵĺ�������S������ж�����ֵĺ͵���S���������
 * ���ĳ˻���С�ġ�
 * 
 * ����֪ʶ�㣺 ���
 * --------------------------------------------
 * @author ilovejava1314
 */
public class ��ΪS����������42 {	
	
	 /*
	  * ˼·:
	  * 	���ƶ��ַ����趨ͷβָ�룬���ͷβָ���Ӧ��ֵ
	  * ����Ϊsum����������ֵ����list�У�����sumβָ���Լ�
	  * С��sumͷָ���Լӡ�
	  *----------------------------------
	  * ����ʱ�䣺13ms
	  * ռ���ڴ棺9412k
	 */
	public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		int l=0,h=array.length-1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(h<=2||array==null) return list;
		while(l<h) {
			if(array[l]+array[h]==sum) {
				list.add(array[l]);
				list.add(array[h]);
				break;
			}
			if(l<h&&array[l]+array[h]>sum) h--;
			if(l<h&&array[l]+array[h]<sum) l++;
		}
		return list;
    }


	
}

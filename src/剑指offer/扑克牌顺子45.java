package ��ָoffer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *LL���������ر��,��Ϊ��ȥ����һ���˿���,���������Ȼ
 *��2������,2��С��(һ����ԭ����54��^_^)...��������г��
 *��5����,�����Լ�������,�����ܲ��ܳ鵽˳��,����鵽��
 *��,������ȥ��������Ʊ,�ٺ٣���������A,����3,С��,����,��
 *Ƭ5��,��Oh My God!������˳��.....LL��������,��������,����
 *��\С �����Կ����κ�����,����A����1,JΪ11,QΪ12,KΪ13��
 *�����5���ƾͿ��Ա�ɡ�1,2,3,4,5��(��С���ֱ���2��4),
 *��So Lucky!����LL����ȥ��������Ʊ���� ����,Ҫ����ʹ����
 *����ģ������Ĺ���,Ȼ���������LL��������Σ� �������
 *���˳�Ӿ����true����������false��Ϊ�˷������,��
 *������Ϊ��С����0��
 * 
 * ����֪ʶ�㣺 �ַ���
 * --------------------------------------------
 * @author ilovejava1314
 */
public class �˿���˳��45 {	
	public static void main(String[] args) {
		int [] numbers = {1,3,6,0,0};
		System.out.println(isContinuous(numbers));
	}
	
	 /*
	  * ˼·:
	  * ��С��Ϊ�����ƣ������Ŵ�С�����������ܳ鵽���ţ�
	  * ������һ�Ŷ�û�������Ƚ���������ѭ�����飬��С��
	  * ������count��¼����������ArrayList��¼�����ݴ�
	  * С���������������������������ֱ�ӷ���true�����
	  * ��С��������1��2��3��ʱ��ֻ���������ֵ��ȥ��С
	  * ֵС�ڵ���4���ɷ���true����û�д�С��ʱ�������������ֵ��
	  * ȥ��Сֵ����4���ܷ���true�������������false
	  * 	
	  *----------------------------------
	  * ����ʱ�䣺14ms
	  * ռ���ڴ棺9236k
	 */
	public static boolean isContinuous(int [] numbers) {
		if(numbers.length!=5) return false;
		//����
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

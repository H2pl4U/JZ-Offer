package ��ָoffer;


/**
 * ͳ��һ�����������������г��ֵĴ�����
 * 
 * ����֪ʶ�㣺 ����
 * -------------------------------------------- 
 * @author ilovejava1314
 */
public class ���������������г��ֵĴ���37 {
	public static void main(String[] args) {
		int[] array = {3,3,3,3,4,5};
		System.out.println(GetNumberOfK(array, 3));
	}

	/*
	 * ˼·:
	 * 		�����������ȿ��Ƕ��ַ������ҳ�����λ�ã�����ѭ��
	 * �ֱ�Ӹ�λ����ǰ�����ͳ����ͬ����������ͬʱֱ������
	 * ѭ����Ч�ʽϸߡ�
	 * ---------------------------------------------
	 * ����ʱ�䣺21ms
	 * ռ���ڴ棺9392k
	 */
	public static int GetNumberOfK(int [] array , int k) {
		int pos=search(array, k);
		if(pos==-1) return 0;
		int count=0;
		//��ǰͳ�ƴ���
		for (int i = pos; i >= 0; i--) {
			if(array[i]==k) {
				count++;
			}else break;
			
		}
		//���ͳ�ƴ���
		for (int i = pos+1; i < array.length; i++) {
			if(array[i]==k) {
				count++;
			}else break;
		}
		return count;
    }
	//���ַ�
	public static int search(int[] array,int k) {
		int l=0,h=array.length-1;
		while(l<=h) {
			int mid = l+(h-l)/2;
			if(array[mid]==k) return mid;
			else if(array[mid]>k) h=mid-1;
			else l=mid+1;
		}
		return -1;
	}
	
	
	
	

}

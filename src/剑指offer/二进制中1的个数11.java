package ��ָoffer;

/**
  * ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
 * @author ilovejava1314
 */
public class ��������1�ĸ���11 {

	public static void main(String[] args) {
		System.out.println(NumberOf1_(-2147483648));
	}
	
	/*
	 * ˼·:
	 * ��������͸�������д��ͬ�ķ�����
	 * �����Ļ����ж�ÿ�γ�2��Ϊ��������ż������Ϊ����1�ĸ���++�����򲻹�
	 * ������Ҫ���룬��������㷽��Ϊint�����ֵ+1��ȥ�����ľ���ֵ��
	 * ������������1�����ķ����������
	 * ------------------------
	  * ����ʱ�䣺18ms
	  * ռ���ڴ棺9312k
	 */
	public static int NumberOf1(int n) {
		int sum=0;
		if(n>=0) {
			while(n>0) {
				if(n==0) break;
				else if(n==1) {
					sum++;
					break;
				}
				if(n%2==1) sum++;
				n/=2;
			}
			return sum;
		}else {
			n=2147483647+n+1;
			while(n>0) {
				if(n==0) break;
				else if(n==1) {
					sum++;
					break;
				}
				if(n%2==1) sum++;
				n/=2;
			}
			return ++sum;
		}
    }
	
	/*
	 * ���һ��������Ϊ0����ô�������������һλ��1��
	 * ������ǰ����������1����ôԭ�������������ұߵ�1�ͻ��Ϊ0��
	 * ԭ����1��������е�0������1(������ұߵ�1���滹��0�Ļ�)��
	 * ��������λ�������ܵ�Ӱ�졣
	 * ------------------------
	  * ����ʱ�䣺14ms
	  * ռ���ڴ棺9160k
	 */
	public static int NumberOf1_(int n) {
		   int count = 0;
		   while (n != 0) {
		       ++count;
		       n = (n - 1) & n;
		   }
		   return count;
	}

}

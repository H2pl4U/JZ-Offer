package ��ָoffer;


/**
 * ���ǿ�����2x1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
 * ������n��2x1��С�������ص��ظ���һ��2xn�Ĵ���Σ��ܹ��ж����ַ�����
 * @author ilovejava1314
 */
public class ���θ���10 {

	public static void main(String[] args) {
		System.out.println(RectCover(5));
	}
	
	/*
	 * �ҵ����� 1 2 3 5 8 13
	 * ����̨��һ����˼·Ҳ������ͬ
	 * ------------------------
	 * ����ʱ�䣺22ms
	 * ռ���ڴ棺9216k
	 */
	public static int RectCover(int target) {
        if(target==1||target==2) return target;
		int fn1=1,fn2=2,sum=0;
		while(target>2) {
			sum=fn1+fn2;
			fn1=fn2;
			fn2=sum;
			target--;
		}
		return sum;
    }

}

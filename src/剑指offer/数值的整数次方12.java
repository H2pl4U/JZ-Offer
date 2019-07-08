package ��ָoffer;

/**
 * ����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
 * @author ilovejava1314
 */
public class ��ֵ�������η�12 {

	public static void main(String[] args) {
		System.out.println(Power2(2, 3));
	}
	
	/*
	 * ˼·:ʹ��Math����η�������
	 * ------------------------
	  * ����ʱ�䣺69ms
	  * ռ���ڴ棺10332k
	 */
	public static double Power(double base, int exponent) {
		return Math.pow(base, exponent);
	}
	
	/*
	 * ˼·:�ݹ���⣬����η����뱻�η����ĸ��������
	 * ���ҷֱ�ͬ�����ͬ����Ľ⡣
	 * ------------------------
	  * ����ʱ�䣺57ms
	  * ռ���ڴ棺10380k
	 */
	public static double Power2(double base, int exponent) {
		//�κ�����0����  ���Ϊ1
		if(exponent==0 && base != 0) return 1;
		//�κ�����1����  ���Ϊ�䱾��
		if(exponent==1) return base;
		//0�ĸ����η����ᱨ��0��������ĸ
		if(exponent<=0 && base == 0) {
			throw new RuntimeException();
		}
		//0���κ������η�����0
		if(exponent>0 && base == 0) return 0;
		//������������ʱ��nȡ�ݵľ���ֵ
		int n = exponent;
		if(exponent<0) {
			n=-exponent;
		}
		//�ݹ飬���base��(n/2)�η�
		double result = Power2(base, n>>1);
		result*=result;
		//��ż���жϣ���Ϊ����
		if((n&1)==1) result*=base;
		//����Ϊ������ȡ����ĵ���
		if(exponent<0) result=1/result;
		return result;
	}

}

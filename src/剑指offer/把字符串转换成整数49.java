package ��ָoffer;


/**
 * ��һ���ַ���ת����һ������(ʵ��Integer.valueOf(string)�Ĺ��ܣ�
 * ����string����������Ҫ��ʱ����0)��Ҫ����ʹ���ַ���ת��������
 * �⺯���� ��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0��
 * 
 * ����֪ʶ�㣺�ַ���  ����ת��
 * @author ilovejava1314
 */
public class ���ַ���ת��������49 {
	public static void main(String[] args) {
		
	}
	
	/*
	 * ˼·:
	 * 	���Ƚ��ַ���ת�����ַ����飬���ż�¼1��ѭ���ַ�����
	 * ����ַ�AsicII���벻��0-9֮��ֱ�ӷ���0������Ҫ����ַ�
	 * �ڵ�ǰsum*10+��ǰ���֡�
	 * -----------------------------------------------
	 * ����ʱ�䣺20ms
	 * ռ���ڴ棺9080k
	 */
	public int StrToInt(String str) {
		if (str.equals("") || str.length() == 0)
            return 0;
        char[] a = str.toCharArray();
        int fuhao = 0;
        if (a[0] == '-')
            fuhao = 1;
        int sum = 0;
        for (int i = fuhao; i < a.length; i++)
        {
            if (a[i] == '+')
                continue;
            if (a[i] < 48 || a[i] > 57)
                return 0;
            sum = sum * 10 + a[i] - 48;
        }
        return fuhao == 0 ? sum : sum * -1;
    }

}

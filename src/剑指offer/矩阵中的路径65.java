package ��ָoffer;

/**
  * ��һ������������У������ظ��Ľ�㣬��ɾ��������
  * ���ظ��Ľ�㣬�ظ��Ľ�㲻��������������ͷָ�롣 
  * ���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5
 * @author ilovejava1314
 */
public class �����е�·��65 {
	/*
	 * ˼·:
	 * 	0.���ݸ������飬��ʼ��һ����־λ���飬��ʼ��Ϊfalse����ʾδ�߹���true��ʾ�Ѿ��߹���
	 * �����ߵڶ���
	 *  1.�����������������������飬���ҵ�һ����str�ַ����ĵ�һ��Ԫ����ƥ��ľ���Ԫ�أ�����judge
	 *  2.����i��j��ȷ��һά�����λ�ã���Ϊ������matrix��һ��һά����
	 *  3.ȷ���ݹ���ֹ������Խ�磬��ǰ�ҵ��ľ���ֵ�����������Ӧλ�õ�ֵ���Ѿ��߹��ģ������������
	 * ��ֱ��false��˵������·��ͨ
	 *  4.��k�����Ǵ��ж����ַ���str�������Ѿ��жϵ������һλ����ʱ˵����ƥ��ɹ���
	 *  5.������Ǳ���ľ��裬�ݹ鲻�ϵ�Ѱ����Χ�ĸ������Ƿ����������ֻҪ��һ�����ӷ����������ͼ���
	 * ����������������ĸ��ӵ������Ƿ���ڷ��������ĸ��ӣ�ֱ��k����ĩβ���߲�����ݹ�������ֹͣ��
	 *  6.�ߵ���һ����˵�������ǲ��ɹ��ģ�����Ҫ��ԭһ�±�־λ����index���ı�־λ��������һ�ֵ��жϡ�
	 * -------------------------------------------
	 * ����ʱ�䣺26ms
	 * ռ���ڴ棺9664k
	 */
	public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
		// ��־λ����ʼ��Ϊfalse
		boolean[] flag = new boolean[matrix.length];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				// ѭ��������ά���飬�ҵ�������str��һ��Ԫ�ص�ֵ���ٵݹ��ж������Ƿ��з���������----���ݷ�
				if (judge(matrix, i, j, rows, cols, flag, str, 0)) {
					return true;
				}
			}
		}
		return false;
	}

	// judge(��ʼ��������������i������������j�������������������������жϵ��ַ������ַ���������ʼΪ0�����ж��ַ����ĵ�һλ)
	private boolean judge(char[] matrix, int i, int j, int rows, int cols, boolean[] flag, char[] str, int k) {
		// �ȸ���i��j����ƥ��ĵ�һ��Ԫ��תΪһά�����λ��
		int index = i * cols + j;
		// �ݹ���ֹ����
		if (i < 0 || j < 0 || i >= rows || j >= cols || matrix[index] != str[k] || flag[index] == true)
			return false;
		// ��k�Ѿ�����strĩβ�ˣ�˵��֮ǰ�Ķ��Ѿ�ƥ��ɹ��ˣ�ֱ�ӷ���true����
		if (k == str.length - 1)
			return true;
		// Ҫ�ߵĵ�һ��λ����Ϊtrue����ʾ�Ѿ��߹���
		flag[index] = true;

		// ���ݣ��ݹ�Ѱ�ң�ÿ���ҵ��˾͸�k��һ���Ҳ�������ԭ
		if (judge(matrix, i - 1, j, rows, cols, flag, str, k + 1)
				|| judge(matrix, i + 1, j, rows, cols, flag, str, k + 1)
				|| judge(matrix, i, j - 1, rows, cols, flag, str, k + 1)
				|| judge(matrix, i, j + 1, rows, cols, flag, str, k + 1)) {
			return true;
		}
		// �ߵ��⣬˵����һ��·��ͨ����ԭ������������·��
		flag[index] = false;
		return false;
	}

}

package ��ָoffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С� 
 * ���������ַ���abc,���ӡ�����ַ�a,b,c�������г�������
 * ���ַ���abc,acb,bac,bca,cab��cba��
 * 
 * ------------------------------------------------- 
 * ֪ʶ��:�ַ��� ��̬�滮���ݹ�
 * 
 * @author ilovejava1314
 */
public class �ַ���������27 {

	/*
	 * ˼·: ���û��ݷ����ֱ�ÿһ��Ԫ�����ڵ�һλ��
	 * �ֱ�֮���Ԫ�� ��������λ�ã����������ַ�
	 * �����ظ�����������С�
	 * 
	 * ˼·Դ��ţ�����ۡ���ȥ���ط����� 
	 * ----------------------------------------------- 
	 * ����ʱ�䣺206ms
	 * ռ���ڴ棺11952k
	 */
	public ArrayList<String> Permutation(String str) {
		List<String> resultList = new ArrayList<>();
		if (str.length() == 0)
			return (ArrayList<String>) resultList;
		// �ݹ�ĳ�ʼֵΪ��str���飬�յ�list����ʼ�±�0��
		fun(str.toCharArray(), resultList, 0);
		Collections.sort(resultList);
		return (ArrayList<String>) resultList;
	}

	private void fun(char[] ch, List<String> list, int i) {
		// ���ǵݹ����ֹ����������i�±��Ѿ��Ƶ�char�����ĩβ��ʱ�򣬿��������һ���ַ�������������
		if (i == ch.length - 1) {
			// �ж�һ���Ƿ��ظ�
			if (!list.contains(new String(ch))) {
				list.add(new String(ch));
				return;
			}
		} else {
			// ��һ�ξ��ǻ��ݷ���������"abc"Ϊ��

			// �ݹ��˼����ջ����ջ�ͳ�ջ��һ����,ĳһ��״̬����return������֮�󣬻�ص������õĵط�����ִ��

			// 1.��һ�ν���������ch=['a','b','c'],list=[],i=0���ҳ�Ϊ ״̬A ������ʼ״̬
			// ��ôj=0��swap(ch,0,0)������['a','b','c']������ݹ飬�Լ����Լ���ֻ��iΪ1������(0,0)λ��֮���״̬�ҳ�Ϊ ״̬B
			// i������2���������j=1��ִ�е�һ��swap(ch,1,1)�����״̬�ҳ�Ϊ ״̬C1
			// ,�ٽ���fun��������ʱ���ΪT1��iΪ2����ô��ʱ�ͽ�����һ��if����"abc"�Ž�list��
			///////////// -------����ʱ�����Ϊ["abc"]

			// 2.ִ����list.add֮������return�����˵�T1����������ִ�еڶ���swap(ch,1,1)��״̬C1�ָֻ�Ϊ״̬B
			// �ָ���֮�󣬼���ִ��forѭ������ʱj=2,��ôswap(ch,1,2),�õ�"acb"�����״̬�ҳ�ΪC2,Ȼ��ִ��fun����ʱ���ΪT2,����i+1=2,����Ҳ����ӽ����������ʱreturn���˵�T2������ִ��
			///////////// -------����ʱ�����Ϊ["abc","acb"]
			// Ȼ��ִ�еڶ���swap(ch,1,2)��״̬C2�ع�״̬B,Ȼ��״̬B��forѭ���˳��ص�״̬A

			//          a|b|c(״̬A)
			//               |
			//               |swap(0,0)
			//               |
			//             a|b|c(״̬B)
			//             /  \
			//   swap(1,1)/    \swap(1,2)  (״̬C1��״̬C2)
			//           /      \
			//         a|b|c   a|c|b

			// 3.�ص�״̬A֮�󣬼���forѭ����j=1,��swap(ch,0,1)����"bac",���״̬�����ٴν���״̬A,����Ĳ���ͬ��
			///////////// -------����ʱ�����Ϊ["abc","acb","bac","bca"]

			//             a|b|c(״̬A)
			//               |
			//               |swap(0,1)
			//               |
			//             b|a|c(״̬B)
			//             /  \
			//   swap(1,1)/    \swap(1,2)  (״̬C1��״̬C2)
			//           /      \
			//         b|a|c   b|c|a

			// 4.�ټ���forѭ����j=2,��swap(ch,0,2)����"cab",���״̬�����ٴν���״̬A������Ĳ���ͬ��
			///////////// -------����ʱ�����Ϊ["abc","acb","bac","bca","cab","cba"]

			//             a|b|c(״̬A)
			//               |
			//               |swap(0,2)
			//               |
			//             c|b|a(״̬B)
			//             /  \
			//   swap(1,1)/    \swap(1,2)  (״̬C1��״̬C2)
			//           /      \
			//         c|b|a   c|a|b

			// 5.����˳�forѭ����������

			for (int j = i; j < ch.length; j++) {
				swap(ch, i, j);
				fun(ch, list, i + 1);
				swap(ch, i, j);
			}
		}
	}

	// ��������������±��Ԫ��
	private void swap(char[] str, int i, int j) {
		if (i != j) {
			char t = str[i];
			str[i] = str[j];
			str[j] = t;
		}
	}

}

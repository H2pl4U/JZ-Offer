package ��ָoffer;

/**
 * 2.��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 * 
 * @author ilovejava1314
 *
 */

public class �ո��滻02 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("we are family");
		System.out.println(replaceSpace2(sb));
		
	}
	
	
	/*
	 * ����һ:
	 * ʹ��StringBuffer��replace����Ľ�����⣬���ҿո��滻����
	 */
	static String replaceSpace(StringBuffer str) {
		for (int i = 0; i < str.length(); i++) {
			if(String.valueOf(str.charAt(i)).equals(" ")) {
				str.replace(i, i+1, "%20");
			}
		}
		return str.toString();
    }
	
	/*
	 * ������:
	 * ����һ���µ��ַ�����ѭ���ַ�����
	 * ��Ϊ�ո��������ַ�����append(���)"%20",�������ԭ�ַ�
	 */
	static String replaceSpace2(StringBuffer str) {
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < str.toString().length(); i++) {
			if(String.valueOf(str.charAt(i)).equals(" ")) {
				sb.append("%20");
			}else {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
	
	
}

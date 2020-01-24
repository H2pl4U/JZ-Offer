package 二刷;

public class 替换空格02 {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("we are family");
		System.out.println(replaceSpace2(sb));
	}
	
	
	public static String replaceSpace2(StringBuffer str) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0;i<str.length();i++) {
			if(str.charAt(i) == ' ') sb.append("%20");
			else sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	
	/*
	 * ac 100%
	 * 运行时间：18ms
	 * 占用内存：9564k
	 */
	public static String replaceSpace(StringBuffer str) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				sb.append("%20");
			}else {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}

}

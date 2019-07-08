package 剑指offer;

/**
 * 2.请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * 
 * @author ilovejava1314
 *
 */

public class 空格替换02 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("we are family");
		System.out.println(replaceSpace2(sb));
		
	}
	
	
	/*
	 * 方法一:
	 * 使用StringBuffer的replace方便的解决问题，查找空格并替换即可
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
	 * 方法二:
	 * 创建一个新的字符串，循环字符串，
	 * 若为空格则在新字符串中append(添加)"%20",否则添加原字符
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

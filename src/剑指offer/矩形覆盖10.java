package ½£Ö¸offer;


/**
 * ÎÒÃÇ¿ÉÒÔÓÃ2x1µÄĞ¡¾ØĞÎºá×Å»òÕßÊú×ÅÈ¥¸²¸Ç¸ü´óµÄ¾ØĞÎ¡£
 * ÇëÎÊÓÃn¸ö2x1µÄĞ¡¾ØĞÎÎŞÖØµşµØ¸²¸ÇÒ»¸ö2xnµÄ´ó¾ØĞÎ£¬×Ü¹²ÓĞ¶àÉÙÖÖ·½·¨£¿
 * @author ilovejava1314
 */
public class ¾ØĞÎ¸²¸Ç10 {

	public static void main(String[] args) {
		System.out.println(RectCover(5));
	}
	
	/*
	 * ÕÒµ½¹æÂÉ 1 2 3 5 8 13
	 * ÓëÌøÌ¨½×Ò»Ñù£¬Ë¼Â·Ò²ÓëÆäÏàÍ¬
	 * ------------------------
	 * ÔËĞĞÊ±¼ä£º22ms
	 * Õ¼ÓÃÄÚ´æ£º9216k
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

package ½£Ö¸offer;

/**
 * Ò»Ö»ÇàÍÜÒ»´Î¿ÉÒÔÌøÉÏ1¼¶Ì¨½×£¬Ò²¿ÉÒÔÌøÉÏ2¼¶¡£
 * Çó¸ÃÇàÍÜÌøÉÏÒ»¸ön¼¶µÄÌ¨½××Ü¹²ÓĞ¶àÉÙÖÖÌø·¨
 * £¨ÏÈºó´ÎĞò²»Í¬Ëã²»Í¬µÄ½á¹û£©¡£
 * @author ilovejava1314
 */
public class ÌøÌ¨½×08 {

	public static void main(String[] args) {
		System.out.println(JumpFloor(4));
	}
	
	/*
	 * µİ¹éË¼Ïë
	 * ---------------------------------------
	  * ÔËĞĞÊ±¼ä£º605ms
	  * Õ¼ÓÃÄÚ´æ£º9200k
	 */
	public static int JumpFloor(int target) {
		if(target==1) return 1;
		else if(target==2) return 2;
		else return JumpFloor(target-1)+JumpFloor(target-2);

    }
	
	/*
	 * Ë¼Â·:
	 * ÀàËÆÓÚì³²¨À­ÆõÊıÁĞ£¬Ê×ÏÈÃ÷°×Ò»¼¶Ì¨½×ÓĞ1ÖÖÌø·¨£¬¶ş¼¶Ì¨½×ÓĞ2ÖÖÌø·¨
	 * Èı¼¶Ì¨½×¿ÉÒÔ´ÓÒ»¼¶Ì¨½×ÌøÉÏÀ´Ò²¿ÉÒÔ´Ó¶ş¼¶Ì¨½×ÌøÉÏÀ´£¬
	 * ¼´µÈÓÚÒ»¼¶Ì¨½×Ìø·¨ÊıÁ¿¼ÓÉÏ¶ş¼¶Ì¨½×Ìø·¨ÊıÁ¿£¬ÒÀ´ËÀàÍÆ¿ÉµÃ³ö
	 * n¼¶Ì¨½×¹²ÓĞn-2¼¶Ì¨½×Ìø·¨ÊıÓën-1¼¶Ì¨½×Ìø·¨ÊıÖ®ºÍ
	 * 1 2 3 5 8 13 ...
	 * Õâ²»ÕıÊÇì³²¨À­ÆõÊıÁĞÂğ£¿
	 * ---------------------------------------
	  * ÔËĞĞÊ±¼ä£º20ms
	  * Õ¼ÓÃÄÚ´æ£º9436k
	 */
	public static int JumpFloor2(int target) {
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

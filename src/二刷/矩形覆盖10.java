package 二刷;

public class 矩形覆盖10 {

	//ac
	public static int RectCover(int target) {
		if(target==1 || target ==2) return target;
		int f1=1,f2=1,sum=0;
		while(target>2) {
			sum=f1+f2;
			f1=f2;
			f2=sum;
		}
		return sum;
	}
}

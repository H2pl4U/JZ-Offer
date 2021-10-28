package 二刷;

public class 不用加减乘除做加法48 {

	//ac
	public static int Add(int num1,int num2) {
		while(num2!=0) {
			int temp = num1^num2;
			num2=(num1&num2)<<1;
			num1=temp;
		}
		return num1;
    }
}

package 三刷;

/**
 * 不用加减乘除做加法48
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class JzOffer48 {

    public static void main(String[] args) {
        System.out.println(sum(-7, -9));
    }

    /**
     * 既然不能加减乘除，只能位运算
     * @param num1
     * @param num2
     * @return
     */
    static int sum(int num1, int num2) {
        //当num2为0时 temp就是最终结果
        while (num2 != 0) {
            //两数异或，相当于两数相加
            int temp = num1 ^ num2;
            //两数相与，相当于对temp取反
            num2 = (num1 & num2) << 1;
            //此时 结果就是temp + num2
            num1 = temp;
        }
        return num1;
    }
}

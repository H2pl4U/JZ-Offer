package 二刷;

import java.util.ArrayList;

public class 调整数组顺序使奇数位于偶数前面13 {

	//ac
	public static void reOrderArray(int [] array) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
			if((array[i]&1)==1) {
				list1.add(array[i]);
			}else {
				list2.add(array[i]);
			}
		}
        for (int i = 0; i < list1.size(); i++) {
        	array[i]=list1.get(i);
        }
        for (int i = list1.size(); i < array.length; i++) {
        	array[i]=list2.get(i-list1.size());
		}
    }
}

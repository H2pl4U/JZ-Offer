package 剑指offer;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * @author ilovejava1314
 */
public class 二叉搜索树的后序遍历序列23 {

	public static void main(String[] args) {
		int[] sequence = {4,5,2,7,3,1};
		System.out.println(VerifySquenceOfBST(sequence));
	}
	
	
	/*
	* 思路:BST的后序序列的合法序列，对于一个序列S，
	* 最后一个元素是x （也就是根），如果去掉最后一个元素
	* 的序列为T，那么T满足：T可以分成两段，前一段（左子树）
	* 小于x，后一段（右子树）大于x，且这两段（子树）都是合
	* 法的后序序列。
	* -----------------------------------------------
	* 运行时间：15ms
	* 占用内存：9224k
	*/
	public static boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence.length==0) return false;
		return IsTreeBST(sequence, 0, sequence.length-1);
    }
	
   
	public static boolean IsTreeBST(int[] sequence ,int start,int end) {
		if(end<=start) return true;
		int i=end-1;
        while(sequence[i]>sequence[end]&&i>start) i--;
          for(int j=start;j<i;j++){
              if(sequence[j]>sequence[end])
                  return false;
          }
        return IsTreeBST(sequence,start,i)&&IsTreeBST(sequence,i+1,end-1);
	}
}

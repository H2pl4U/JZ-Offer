package ��ָoffer;

/**
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
 * ����������Yes,�������No���������������������������ֶ�������ͬ��
 * @author ilovejava1314
 */
public class �����������ĺ����������23 {

	public static void main(String[] args) {
		int[] sequence = {4,5,2,7,3,1};
		System.out.println(VerifySquenceOfBST(sequence));
	}
	
	
	/*
	* ˼·:BST�ĺ������еĺϷ����У�����һ������S��
	* ���һ��Ԫ����x ��Ҳ���Ǹ��������ȥ�����һ��Ԫ��
	* ������ΪT����ôT���㣺T���Էֳ����Σ�ǰһ�Σ���������
	* С��x����һ�Σ�������������x���������Σ����������Ǻ�
	* ���ĺ������С�
	* -----------------------------------------------
	* ����ʱ�䣺15ms
	* ռ���ڴ棺9224k
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

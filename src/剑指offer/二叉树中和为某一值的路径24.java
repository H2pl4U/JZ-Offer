package ��ָoffer;

import java.util.ArrayList;

/**
  * ����һ�Ŷ������ĸ��ڵ��һ����������ӡ����������
  * ���ֵ�ĺ�Ϊ��������������·����·������Ϊ������
  * ����㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·
  * ����(ע��: �ڷ���ֵ��list�У����鳤�ȴ�����鿿ǰ)
 * @author ilovejava1314
 */
public class �������к�Ϊĳһֵ��·��24 {

   /*
	* ˼·:�ݹ���⣬������㲻Ϊ�գ��Ƚ����ڵ������һ�������У�
	*��Ҫ���target��ȥ���ڵ��ֵ��������target����Ϊ0��ĩβ
	*������Ҷ�ӽڵ�ʱ��˵����·���������飬���������������
	*������Щ��������ô�����������������������ֲ�Ѱ�ң���������
	*����������������ʱ����������
	* -----------------------------------------------
	* ����ʱ�䣺19ms
	* ռ���ڴ棺9560k
	*/
	private ArrayList<ArrayList<Integer>> listAll= new ArrayList<ArrayList<Integer>>();
	private ArrayList<Integer> list = new ArrayList<Integer>();
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		//�ڵ���Ϊ�գ�ֱ�ӷ��ؽ��(�ݹ������������ж��Ƿ�ΪҶ�ӽڵ�)
		if (root==null) return listAll;
		//�ڵ㲻Ϊ�գ��Ƚ��ڵ����һ��ArrayList��
		list.add(root.val);
		//target(�ܺ�)��ȥ�˸��ڵ�
		target-=root.val;
		//������㣬�ܺ�Ϊ0������������Ϊ�գ�����·���ĺ�Ϊtarget��ĩβ�ڵ�ΪҶ�ӽڵ�
		if(target==0&&root.left==null&&root.right==null) {
			//������·��������������
			listAll.add(new ArrayList<Integer>(list));
		}
		//Ѱ������ڵ��������
		if(root.left!=null)	FindPath(root.left, target);
		//Ѱ������ڵ��������
		if(root.right!=null) FindPath(root.right, target);
		//����·��ĩβԪ��ɾ��,��ȱ�����һ��·����Ҫ����
		list.remove(list.size()-1);
		return listAll;
    }

}

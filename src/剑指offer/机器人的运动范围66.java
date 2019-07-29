package ��ָoffer;

/**
  * ������һ��m�к�n�еķ���һ�������˴�����0,0�ĸ���
  * ��ʼ�ƶ���ÿһ��ֻ�������ң��ϣ����ĸ������ƶ�һ��
  * ���ǲ��ܽ�������������������λ֮�ʹ���k�ĸ��ӡ� ��
  * �磬��kΪ18ʱ���������ܹ����뷽��35,37������Ϊ
  * 3+5+3+7 = 18�����ǣ������ܽ��뷽��35,38������Ϊ
  * 3+5+3+8 = 19�����ʸû������ܹ��ﵽ���ٸ����ӣ�
 * @author ilovejava1314
 */
public class �����˵��˶���Χ66 {
	/*
	 * ˼·:
	 * 	1.��(0,0)��ʼ�ߣ�ÿ�ɹ���һ����ǵ�ǰλ��Ϊtrue,Ȼ��ӵ�
	 * ǰλ�����ĸ�����̽��������1 + 4 �������̽��ֵ֮�͡�
	 * 2.̽��ʱ���жϵ�ǰ�ڵ��Ƿ�ɴ�ı�׼Ϊ��
	 * 	1����ǰ�ڵ��ھ����ڣ�
	 * 	2����ǰ�ڵ�δ�����ʹ���
	 * 	3����ǰ�ڵ�����limit���ơ�
	 * -------------------------------------------
	 * ����ʱ�䣺14ms
	 * ռ���ڴ棺9292k
	 */
	public int movingCount(int threshold, int rows, int cols) {
		boolean[][] visited = new boolean[rows][cols];
		return countingSteps(threshold, rows, cols, 0, 0, visited);
	}

	public int countingSteps(int limit, int rows, int cols, int r, int c, boolean[][] visited) {
		if (r < 0 || r >= rows || c < 0 || c >= cols || visited[r][c] || bitSum(r) + bitSum(c) > limit)
			return 0;
		visited[r][c] = true;
		return countingSteps(limit, rows, cols, r - 1, c, visited) + countingSteps(limit, rows, cols, r, c - 1, visited)
				+ countingSteps(limit, rows, cols, r + 1, c, visited)
				+ countingSteps(limit, rows, cols, r, c + 1, visited) + 1;
	}

	public int bitSum(int t) {
		int count = 0;
		while (t != 0) {
			count += t % 10;
			t /= 10;
		}
		return count;
	}
}

package ��ָoffer;

/*
 * �����һ�������������ж���һ���������Ƿ����һ������ĳ�ַ��������ַ���·����
 * ·�����ԴӾ����е�����һ��ʼ��ÿһ�������ھ����������ҡ��ϡ����ƶ�һ��
 * ���һ��·�������˾����ĳһ����ô��·�������ٴν���ø��ӡ����磬������
 * ��3��4�ľ����а���һ���ַ�����bfce����·����·���е���ĸ�üӴֱ������
 * [["a","b","c","e"],
 * ["s","f","c","s"],
 * ["a","d","e","e"]]
 * �������в������ַ�����abfb����·������Ϊ�ַ����ĵ�һ���ַ�bռ���˾����еĵ�
 * һ�еڶ�������֮��·�������ٴν���������ӡ�
 */
public class �����е�·��67 {

	public boolean exist(char[][] board, String word) {
		char[] w = word.toCharArray();
		boolean[][] visited = new boolean[board.length][board[0].length];
		for (int i = 0;i < visited.length;i++) {
			for (int j = 0;j < visited[0].length;j++) {
				if(dfs(board,i,j,w,0,visited))
					return true;
			}
		}
		return false;
	}

	private boolean dfs(char[][] board, int i, int j, char[] word, int pos, boolean[][] visited) {
		if(pos == word.length) return true;
		if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] ) return false;
		if(word[pos] != board[i][j]) return false;
		visited[i][j] = true;
		boolean res = dfs(board,i+1,j,word,pos+1,visited) || dfs(board,i-1,j,word,pos+1,visited) || dfs(board,i,j+1,word,pos+1,visited) || dfs(board,i,j-1,word,pos+1,visited);
		visited[i][j] = false;
		return res;
	}

}

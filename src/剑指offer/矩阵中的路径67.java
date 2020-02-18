package 剑指offer;

/*
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一格开始，每一步可以在矩阵中向左、右、上、下移动一格。
 * 如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。例如，在下面
 * 的3×4的矩阵中包含一条字符串“bfce”的路径（路径中的字母用加粗标出）。
 * [["a","b","c","e"],
 * ["s","f","c","s"],
 * ["a","d","e","e"]]
 * 但矩阵中不包含字符串“abfb”的路径，因为字符串的第一个字符b占据了矩阵中的第
 * 一行第二个格子之后，路径不能再次进入这个格子。
 */
public class 矩阵中的路径67 {

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

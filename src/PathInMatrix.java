/**
 * FileName: PathInMatrix
 * Description:矩阵中的路径
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一格开始，每一步可以在矩阵中向左、右、上、下移动一格。
 * 如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。
 * 例如，在下面的3×4的矩阵中包含一条字符串“bfce”的路径（路径中的字母用加粗标出）。
 * [["a","b","c","e"],
 * ["s","f","c","s"],
 * ["a","d","e","e"]]
 * 但矩阵中不包含字符串“abfb”的路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，
 * 路径不能再次进入这个格子
 * Author:   @VirtualChen
 * Date:     2020/3/20 20:57
 */
package src;

public class PathInMatrix {
    /**
     * 利用回溯法
     *
     * @param board
     * @param word
     * @return
     */
    public boolean exist(char[][] board, String word) {
        if (board.length == 0 || board[0].length == 0 || word.length() == 0) {
            return false;
        }
        int pathlen = 0;
        int[] visited = new int[board.length * board[0].length];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (hasPathCore(board, board.length, board[0].length, row, col, word, pathlen, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasPathCore(char[][] board, int rows, int cols, int row, int col, String word, int pathlen, int[] vistied) {
        if (pathlen == word.length()) {
            return true;
        }
        boolean haspath = false;
        if (row < 0 || row >= rows || col >= cols || col < 0
                || board[row][col] != word.charAt(pathlen) ||
                vistied[row * cols + col] != 0
        ) {
            return false;
        }
        pathlen++;
        vistied[row * cols + col] = 1;
        haspath = hasPathCore(board, rows, cols, row, col - 1, word, pathlen, vistied)
                || hasPathCore(board, rows, cols, row - 1, col, word, pathlen, vistied)
                || hasPathCore(board, rows, cols, row, col + 1, word, pathlen, vistied)
                || hasPathCore(board, rows, cols, row + 1, col, word, pathlen, vistied);
        if (!haspath) {
            pathlen--;
            vistied[row * cols + col] = 0;
        }
        return haspath;
    }
}

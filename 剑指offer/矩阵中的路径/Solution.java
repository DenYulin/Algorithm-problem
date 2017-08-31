public class Solution {

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        if (matrix == null || matrix.length == 0 || matrix.length != (rows * cols) || rows <= 0 || cols <= 0 || str == null || str.length == 0) {
            return false;
        }
        boolean[] visited = new boolean[rows * cols];

        int[] pathLength = {0};
        for (int row = 0; row < rows; ++row) {
            for (int col = 0; col < cols; ++col) {
                if (hasPathCore(matrix, rows, cols, row, col, str, pathLength, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean  hasPathCore(char[] matrix, int rows, int cols, int row, int col, char[] str, int[] pathLength, boolean[] visited) {
        boolean hasPath = false;
        if (row >= 0 && row < rows && col >= 0 && col < cols && matrix[row * cols + col] == str[pathLength[0]] && !visited[row * cols + col]) {
            ++pathLength[0];
            visited[row * cols + col] = true;

            if (str.length == pathLength[0]) {
                return true;
            }
            hasPath = hasPathCore(matrix, rows, cols, row, col - 1, str, pathLength, visited)
                    || hasPathCore(matrix, rows, cols, row - 1, col, str, pathLength, visited)
                    || hasPathCore(matrix, rows, cols, row, col + 1, str, pathLength, visited)
                    || hasPathCore(matrix, rows, cols, row + 1, col, str, pathLength, visited);

            if (!hasPath) {
                --pathLength[0];
                visited[row * cols + col] = false;
            }
        }
        return hasPath;
    }

    public static void main(String[] args) {
        String m = "ABCESFCSADEE";
        String s = "ABCCED";
        char[] matrix = m.toCharArray();
        char[] str = s.toCharArray();
        Solution st = new Solution();
        boolean flag = st.hasPath(matrix, 3, 4, str);
        System.out.println(flag);
    }

}
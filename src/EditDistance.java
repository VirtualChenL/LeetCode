/**
 * FileName: EditDistance
 * Description: 给定两个单词 word1 和 word2，计算出将 word1 转换成 word2 所使用的最少操作数 。
 * 你可以对一个单词进行如下三种操作：  插入一个字符 删除一个字符 替换一个字符
 * Author:   @VirtualChen
 * Date:     2020/2/22 21:07
 */
package src;

/**
 * 计算最小编辑距离
 * 对于两个字符串A[i.....k]和B[j.....m]
 * 我们从首字符进行判断 共有四种情况
 * 如果A[i]和B[j]相同，则直接计算A[i+1....k]和B[j+1....m]的最小编辑距离即可
 * 如果不相同 则有三种情况：
 * ①A前面插入一个B相同字符 则此时需要计算A[i.....k]和B[j+1.....m]的编辑距离
 * ②A删除第一个字符在比较，则此时需要计算A[i+1....k]和B[j.....m]的编辑距离
 * ③A的i字符替换成B的j字符，则此时需要计算A[i....k]和B[j.....m]的编辑距离+替换的操作（1）
 */



public class EditDistance {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        System.out.println(m);
        int n = word2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i <= n; i++) {
            dp[0][i] = i;
        }
        int cost = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i-1)== word2.charAt(j-1)) {
                    cost = 0;
                } else {
                    cost = 1;
                }
                dp[i][j] = Math.min(dp[i - 1][j - 1] + cost, Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1));
            }
        }
        return dp[m][n];
    }
}

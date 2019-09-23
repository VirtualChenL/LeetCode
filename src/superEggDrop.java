/**
 * @Auther: VirtualChen601
 * @Date: 2019/9/3 08:49
 * @Description:你将获得 K 个鸡蛋，并可以使用一栋从 1 到 N  共有 N 层楼的建筑。
 * <p>
 * 每个蛋的功能都是一样的，如果一个蛋碎了，你就不能再把它掉下去。
 * <p>
 * 你知道存在楼层 F ，满足 0 <= F <= N 任何从高于 F 的楼层落下的鸡蛋都会碎，从 F 楼层或比它低的楼层落下的鸡蛋都不会破。
 * <p>
 * 每次移动，你可以取一个鸡蛋（如果你有完整的鸡蛋）并把它从任一楼层 X 扔下（满足 1 <= X <= N）。
 * <p>
 * 你的目标是确切地知道 F 的值是多少。
 * <p>
 * 无论 F 的初始值如何，你确定 F 的值的最小移动次数是多少
 */
public class superEggDrop {
    /**
     * 动态规划
     *
     * @param K
     * @param N
     * @return
     */
    public int superEggDrop(int K, int N) {
        if (K == 0) return 0;
        if (K == 1) return N;
        int dp[][] = new int[N + 2][K + 2];//dp表示K个鸡蛋在m步内最多可以测试出的层数
        dp[0][0] = 0;
        for (int i = 1; i <= N; i++) {
            dp[i][0] = 0;
            for (int j = 0; j <= K; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1] + 1;
                if (dp[i][j] >= N) {
                    return i;
                }
            }

        }
        return N;
    }
}

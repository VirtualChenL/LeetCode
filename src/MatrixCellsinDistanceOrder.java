/**
 * @Auther: VirtualChen601
 * @Date: 2019/6/26 14:16
 * @Description:给出 R 行 C 列的矩阵，其中的单元格的整数坐标为 (r, c)，满足 0 <= r < R 且 0 <= c < C。
 * <p>
 * 另外，我们在该矩阵中给出了一个坐标为 (r0, c0) 的单元格。
 * <p>
 * 返回矩阵中的所有单元格的坐标，并按到 (r0, c0) 的距离从最小到最大的顺序排，其中，
 * 两单元格(r1, c1) 和 (r2, c2) 之间的距离是曼哈顿距离，|r1 - r2| + |c1 - c2|。（你可以按任何满足此条件的顺序返回答案。）
 */
public class MatrixCellsinDistanceOrder {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] ans = new int[R * C][2];
        ans[0][0] = r0;
        ans[0][1] = c0;
        int k = 1;
        for (int i = 1; i <=R*C; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    if (c0 + i < C) {
                        ans[k][0] = r0;
                        ans[k][1] = c0 + i;
                        k++;
                    }
                    if (c0 - i >= 0) {
                        ans[k][0] = r0;
                        ans[k][1] = c0 - i;
                        k++;
                    }
                } else if (j == i) {
                    if (r0 + j < R) {
                        ans[k][0] = r0 + j;
                        ans[k][1] = c0;
                        k++;
                    }
                    if (r0 - j >= 0) {
                        ans[k][0] = r0 - j;
                        ans[k][1] = c0;
                        k++;
                    }
                } else {
                    if (r0 + j < R && c0 + i - j < C) {
                        ans[k][0] = r0 + j;
                        ans[k][1] = c0 + i - j;
                        k++;
                    }
                    if (r0 - j >= 0&& c0 + i - j < C) {
                        ans[k][0] = r0 - j;
                        ans[k][1] = c0 + i - j;
                        k++;
                    }
                    if (r0 + j < R &&  c0 - i + j >= 0) {
                        ans[k][0] = r0 + j;
                        ans[k][1] = c0 - i + j;
                        k++;
                    }
                    if (r0 - j >= 0 &&  c0 - i + j >= 0) {
                        ans[k][0] = r0 - j;
                        ans[k][1] = c0 - i + j;
                        k++;
                    }
                }
            }

        }
        return ans;
    }
}

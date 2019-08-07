/**
 * @Auther: VirtualChen601
 * @Date: 2019/7/24 09:15
 * @Description:根据每日 气温 列表，请重新生成一个列表，对应位置的输入是你需要再等待多久温度才会升高超过该日的天数。
 * 如果之后都不会升高，请在该位置用 0 来代替。
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        int[] ans = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            for (int j = i; j < T.length; j++) {
                if (T[j] > T[i]) {
                    ans[i] = j - i;
                    break;
                }
            }
        }
        return ans;
    }
}

/**
 * FileName: TaskScheduler
 * Description: 任务调度器
 * Author:   @VirtualChen
 * Date:     2018/12/18 0018 下午 4:33
 */

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] nums = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            nums[tasks[i] - 65]++;
        }
        int max = 0;
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, nums[i]);
        }
        int k = 0;
        for (int i = 0; i < 26; i++) {
            if (nums[i] == max) {
                k++;
            }
        }
        return Math.max((max - 1) * (n+1) + k , tasks.length);
    }
}

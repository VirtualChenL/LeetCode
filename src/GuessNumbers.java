/**
 * FileName: GuessNumbers
 * Description: 小A 和 小B 在玩猜数字。小B 每次从 1, 2, 3 中随机选择一个，
 * 小A 每次也从 1, 2, 3 中选择一个猜。他们一共进行三次这个游戏，请返回 小A 猜对了几次？
 * Author:   @VirtualChen
 * Date:     2020/2/21 20:56
 */
package src;

public class GuessNumbers {
    public int game(int[] guess, int[] answer) {
        int a=0;
        for(int i=0;i<answer.length;i++ ){
            if (guess[i]!=answer[i]){
                a++;
            }
        }
        return a;
    }
}

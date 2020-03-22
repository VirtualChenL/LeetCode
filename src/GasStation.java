/**
 * FileName: GasStation
 * Description: 加油站
 * Author:   @VirtualChen
 * Date:     2019/3/6 0006 上午 9:32
 */

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int run=0,start=0,rest=0;
       for(int i=0;i<gas.length;i++){
           run+=(gas[i]-cost[i]);
           rest+=(gas[i]-cost[i]);
           if(run<0){
               start=i+1;
               run=0;
           }
       }
       return rest<0?-1:start;
    }
}

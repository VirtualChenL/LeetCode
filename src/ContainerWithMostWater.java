/**
 * FileName: ContainerWithMostWater
 * Description:  盛最多水的容器
 * Author:   @VirtualChen
 * Date:     2019/3/18 0018 上午 10:30
 */

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int low=0;
        int high=height.length-1;
        int maxwater=Math.min(height[high],height[low])*(high-low);
        while(high>low){
            if(height[low]<height[high]){
                low++;
            }
            else{
                high--;
            }
            maxwater=Math.max(maxwater,Math.min(height[high],height[low])*(high-low));
        }
        return maxwater;
    }
}

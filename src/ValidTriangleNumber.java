import java.util.Arrays;

/**
 * FileName: ValidTriangleNumber
 * Description: 有效三角形的个数
 * Author:   @VirtualChen
 * Date:     2019/3/6 0006 上午 9:12
 */

public class ValidTriangleNumber {
    public int triangleNumber(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++ ){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(checkTriangle(nums[i],nums[j],nums[k])){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public boolean checkTriangle(int a,int b, int c){
        if(a+b>c&&(a+c)>b&&(b+c)>a&&Math.abs(a-c)<b&&Math.abs(a-b)<c&&Math.abs(b-c)<a){
            return true;
        }
        return false;
    }
}

/**
 * FileName: DeleteColumnstoMakeSorted
 * Description: 删列造序
 * Author:   @VirtualChen
 * Date:     2018/12/26 0026 下午 3:09
 */

public class DeleteColumnstoMakeSorted {
    public int minDeletionSize(String[] A) {
        if(A==null||A.equals(null)){
            return 0;
        }
        int answer=0;
        for(int i=0;i<A[0].length();i++){
            for(int j=0;j<A.length-1;j++){
                if(A[j].charAt(i)>A[j+1].charAt(i)){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}

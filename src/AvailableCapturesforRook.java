/**
 * FileName: AvailableCapturesforRook
 * Description: 车的可用捕获量
 * Author:   @VirtualChen
 * Date:     2019/3/6 0006 上午 8:56
 */

public class AvailableCapturesforRook {
    public int numRookCaptures(char[][] board) {
        if(board.length==0){
            return 0;
        }
        int result=0;
        /**
         * 找到车的坐标
         */
        int x=0,y=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='R'){
                    x=i;
                    y=j;
                    break;
                }
            }
        }

        for(int i=x;i>=0;i--){
            if(board[i][y]=='p'){
                result++;
                break;
            }else if(board[i][y]=='B'){
                break;
            }
        }
        for(int i=x;i<board[0].length;i++){
            if(board[i][y]=='p'){
                result++;
                break;
            }else if(board[i][y]=='B'){
                break;
            }
        }

        for(int j=y;j>=0;j--){
            if(board[x][j]=='p'){
                result++;
                break;
            }else if(board[x][j]=='B'){
                break;
            }
        }

        for(int j=y;j<board.length;j++){
            if(board[x][j]=='p'){
                result++;
                break;
            }else if(board[x][j]=='B'){
                break;
            }
        }
        return result;
    }
}

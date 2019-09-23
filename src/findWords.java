import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Auther: VirtualChen601
 * @Date: 2019/9/23 15:24
 * @Description:
 */
public class findWords {
    public int[] dx={1,-1,0,0};
    public int[] dy={0,0,1,-1};
    private static class Trie{//字典树，前缀树
        String word;
        Trie[] next=new Trie[26];
        public Trie append(char ch){
            if (next[ch-'a']!=null){
                return next[ch-'a'];
            }
            next[ch-'a']=new Trie();
            return next[ch-'a'];
        }
    }
    public boolean[][] visted;//判断是否访问
    public List<String> res;//保存结果

    public List<String> findWords(char[][] board, String[] words) {
        Trie root=new Trie();
        for(String word:words){//保存所有words到字典树种
            Trie cur=root;
            char[] wd =word.toCharArray();
            for (char c:wd){
                cur=cur.append(c);
            }
            cur.word=word;//结束，表明已经保存了完整的单词
        }
        res=new ArrayList<>();
        visted=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                dfs(root,i,j,board);
            }
        }
        Collections.sort(res);
        return new ArrayList<>(res);
    }
    public void dfs(Trie cur,int x,int y,char[][] board){//遍历二维矩阵
        if(x<0||y<0||x>=board.length||y>=board[0].length||visted[x][y]){
            return;
        }//边界
        cur=cur.next[board[x][y]-'a'];//下一个节点
        visted[x][y]=true;//设置当前节点为已经访问
        if(cur!=null){
            if(cur.word!=null){
                res.add(cur.word);
                cur.word=null;//防止重复加入单词
            }
            for (int i=0;i<4;i++){
                dfs(cur, x+dx[i],y+dy[i],board);
            }
        }
        visted[x][y]=false;
    }
}

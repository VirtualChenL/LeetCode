import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Auther: VirtualChen601
 * @Date: 2019/9/18 19:28
 * @Description:给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，
 * 判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
 */
public class wordBreak {
    /**
     * 动态规划
     * @param s
     * @param wordDict
     * @return
     */
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<s.length();i++){
            for(int j=i-1;j>=0&&!dp[i];j--){
                String check=s.substring(j,i);
                dp[i]=dp[j]&&wordDict.contains(check);
            }
        }
        return dp[s.length()];
    }

    /**
     * BFS
     * @param s
     * @param wordDict
     * @return
     */
    public boolean wordBreak2(String s, List<String> wordDict) {
        Queue<Integer> q = new LinkedList<>(); //构建队列，存储前缀位置
        boolean[] visited = new boolean[s.length() + 1]; //总共有s.length()个位置可能产生前缀
        for (int i = 0; i < wordDict.size(); i++) //找到源节点的相邻节点，即可以通过前缀访问的节点
            if (s.length() >= wordDict.get(i).length() && s.indexOf(wordDict.get(i)) == 0)
                q.add(wordDict.get(i).length());
        visited[0] = true; //标记起始位置
        while (!q.isEmpty()) {
            int start = q.poll(); //取出即将访问的前缀位置
            if (start == s.length()) return true;
            if (!visited[start]) {
                visited[start] = true; //标记前缀位置为已访问
                String sub = s.substring(start); //依据前缀位置更新权值
                for (int i = 0; i < wordDict.size(); i++) //根据权值，访问具有相同前缀的下一位置
                    if (sub.length() >= wordDict.get(i).length() && sub.indexOf(wordDict.get(i)) == 0)
                        q.add(start + wordDict.get(i).length());
            }
        }
        return false;
    }

    /**
     * DFS
     * @param s
     * @param wordDict
     * @return
     */
    public boolean wordBreak3(String s, List<String> wordDict) {
        boolean[] visited = new boolean[s.length()+1]; //总共有s.length()个位置可能产生前缀
        return dfs(wordDict, s, s, 0, visited);
    }

    private boolean dfs(List<String> wordDict, String target, String sub, int start, boolean[] visited) {
        if (start == target.length()) return true; //如果前缀的位置在target末尾，证明达到目标节点
        boolean mark = false;
        for (int p = 0; p < wordDict.size(); p++) {
            String word = wordDict.get(p);
            if (word.length() > sub.length()) continue;
            if (sub.indexOf(word) == 0) { //查询前缀
                int next = word.length(); //记录找到的前缀的长度
                if (!visited[next + start]) { //即将要访问的前缀位置为当前位置start加上前缀长度next
                    visited[next + start] = true; //标记前缀位置为已访问
                    mark = mark || dfs(wordDict, target, sub.substring(next), next + start, visited); //更新权值后，访问下一位置
                }
            }
        }
        return mark;
    }
}

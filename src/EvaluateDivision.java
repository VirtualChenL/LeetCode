import java.util.*;

/**
 * @Auther: VirtualChen601
 * @Date: 2019/7/24 10:11
 * @Description:给出方程式 A / B = k, 其中 A 和 B 均为代表字符串的变量， k 是一个浮点型数字。
 * 根据已知方程式求解问题，并返回计算结果。如果结果不存在，则返回 -1.0。
 */


/**
 * 对于图的深度优先遍历，我们选择用一个邻接矩阵graph来存储图的边权值，
 * 同时每一次求两点间的距离都初始化一个visited数组来标记哪些节点已经被遍历过。
 * 深度优先遍历过程中，求解距离用的不应该是加法，而应该是乘法。
 */
public class EvaluateDivision {

    private Map<String, Integer> stringToInteger = new HashMap<>();

    private int index = 0;

    private double[][] graph;

    private boolean[] visited;

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        for (List<String> list : equations) {
            for (String string : list) {
                if (!stringToInteger.containsKey(string)) {
                    stringToInteger.put(string, index++);
                }
            }
        }
        graph = new double[index][index];
        for (int i = 0; i < equations.size(); i++) {
            List<String> list = equations.get(i);
            String string0 = list.get(0), string1 = list.get(1);
            int index1 = stringToInteger.get(string0), index2 = stringToInteger.get(string1);
            graph[index1][index2] = values[i];
            graph[index2][index1] = 1.0 / values[i];
        }
        double[] result = new double[queries.size()];
        Arrays.fill(result, -1.0);
        for (int i = 0; i < result.length; i++) {
            List<String> list = queries.get(i);
            String string0 = list.get(0), string1 = list.get(1);
            if (stringToInteger.containsKey(string0) && stringToInteger.containsKey(string1)) {
                if (string0.equals(string1)) {
                    result[i] = 1.0;
                } else {
                    int index1 = stringToInteger.get(string0), index2 = stringToInteger.get(string1);
                    visited = new boolean[index];
                    double len = 1.0;
                    dfs(index1, index2, len, result, i);
                }
            }
        }
        return result;
    }

    private void dfs(int begin, int end, double len, double[] result, int k) {
        if (graph[begin][end] == 0) {
            visited[begin] = true;
            for (int i = 0; i < index; i++) {
                if (!visited[i] && graph[begin][i] != 0) {
                    dfs(i, end, len * graph[begin][i], result, k);
                }
            }
        } else {
            result[k] = len * graph[begin][end];
        }
    }

}
/**
 * FileName: LargestTriangleArea
 * Description: 最大三角形面积
 * Author:   @VirtualChen
 * Date:     2019/3/22 0022 上午 8:43
 */

public class LargestTriangleArea {
    public double largestTriangleArea(int[][] points) {
        int[][] tem = new int[3][2];
        double largestarea = 0;
        for (int i = 0; i < points.length - 2; i++) {
            for (int j = i + 1; j < points.length - 1; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    tem[0][0] = points[i][0];
                    tem[0][1] = points[i][1];
                    tem[1][0] = points[j][0];
                    tem[1][1] = points[j][1];
                    tem[2][0] = points[k][0];
                    tem[2][1] = points[k][1];
                    largestarea = Math.max(largestarea, TriangleArea(tem));
                }
            }
        }
        return largestarea;
    }

    public static double TriangleArea(int[][] a) {
        double x1 = a[0][0];
        double y1 = a[0][1];
        double x2 = a[1][0];
        double y2 = a[1][1];
        double x3 = a[2][0];
        double y3 = a[2][1];
        double ans = (x1 * y2 + x2 * y3 + x3 * y1 - x1 * y3 - x2 * y1 - x3 * y2) / 2;
        return Math.abs(ans);
    }

}

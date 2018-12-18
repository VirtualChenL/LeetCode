/**
 * FileName: ConstructBinaryTreefromInorderandPostorderTraversal
 * Description: 从中序与后序遍历序列构造二叉树
 * Author:   @VirtualChen
 * Date:     2018/12/18 0018 上午 9:32
 */

public class ConstructBinaryTreefromInorderandPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder.length == 0 || inorder.length == 0) {
            return null;
        }
        TreeNode answer = new TreeNode(postorder[postorder.length-1]);
        if (postorder.length == 1) {
            return answer;
        }
        int i = 0;
        while (i < postorder.length && inorder[i] != postorder[postorder.length-1]) {
            i++;
        }
        int[] leftPost = new int[i];
        int[] leftIn = new int[i];
        int[] rightPost = new int[postorder.length - i - 1];
        int[] rightIn = new int[postorder.length - i - 1];

        for (int j = 0; j < i; j++) {
            leftIn[j] = inorder[j];
            leftPost[j] = postorder[j];
        }

        answer.left = buildTree(leftIn,leftPost);
        for (int j = 0; j < postorder.length - i - 1; j++) {
            rightPost[j] = postorder[i + j ];
            rightIn[j] = inorder[i + j + 1];
        }
        answer.right = buildTree(rightIn,rightPost);
        return answer;
    }
}

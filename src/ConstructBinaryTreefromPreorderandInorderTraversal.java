/**
 * FileName: ConstructBinaryTreefromPreorderandInorderTraversal
 * Description: 从前序与中序遍历序列构造二叉树
 * Author:   @VirtualChen
 * Date:     2018/12/18 0018 上午 8:59
 */

public class ConstructBinaryTreefromPreorderandInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        TreeNode answer = new TreeNode(preorder[0]);
        if (preorder.length == 1) {
            return answer;
        }
        int i = 0;
        while (i < preorder.length && inorder[i] != preorder[0]) {
            i++;
        }
        int[] leftPre = new int[i];
        int[] leftIn = new int[i];
        int[] rightPre = new int[preorder.length - i - 1];
        int[] rightIn = new int[preorder.length - i - 1];

        for (int j = 0; j < i; j++) {
            leftPre[j] = preorder[j + 1];
            leftIn[j] = inorder[j];
        }

        answer.left = buildTree(leftPre, leftIn);
        for (int j = 0; j < preorder.length - i - 1; j++) {
            rightPre[j] = preorder[i + j + 1];
            rightIn[j] = inorder[i + j + 1];
        }
        answer.right = buildTree(rightPre, rightIn);
        return answer;
    }
}

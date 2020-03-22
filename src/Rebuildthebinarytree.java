/**
 * FileName: Rebuildthebinarytree
 * Description:重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * Author:   @VirtualChen
 * Date:     2020/3/17 20:44
 */
package src;

public class Rebuildthebinarytree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        int a = preorder[0];
        TreeNode node = new TreeNode(a);
        int k = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == a) {
                break;
            }
            k++;
        }
        int[] preleft = new int[k];
        int[] inleft = new int[k];
        int[] preright = new int[inorder.length - k - 1];
        int[] inright = new int[inorder.length - k - 1];
        for (int i = 0; i < k; i++) {
            preleft[i] = preorder[i + 1];
            inleft[i] = inorder[i];
        }
        for (int i = 0; i < inorder.length - k - 1; i++) {
            preright[i] = preorder[k + 1 + i];
            inright[i] = inorder[k + 1 + i];
        }
        node.left = buildTree(preleft, inleft);
        node.right = buildTree(preright, inright);
        return node;
    }
}

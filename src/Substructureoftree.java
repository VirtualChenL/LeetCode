/**
 * FileName: Substructureoftree
 * Description: 树的子结构
 * 输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
 * B是A的子结构， 即 A中有出现和B相同的结构和节点值
 * Author:   @VirtualChen
 * Date:     2020/3/29 20:11
 */
package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class Substructureoftree {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null) {
            return false;
        }
        if (B == null) {
            return false;
        }
        if (isSame(A, B)) {
            return true;
        }
        return isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    //判断B树结构是否为A树的一部分
    private boolean isSame(TreeNode a, TreeNode b) {
        if (b == null) return true;
        if (a == null) return false;
        return a.val == b.val && isSame(a.left, b.left) && isSame(a.right, b.right);
    }

}


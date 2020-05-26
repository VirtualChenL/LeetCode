/**
 * FileName: Stackpushandpopsequence
 * Description: 栈的压入、弹出序列
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如，序列 {1,2,3,4,5} 是某栈的压栈序列，
 * 序列 {4,5,3,2,1} 是该压栈序列对应的一个弹出序列，
 * 但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列
 * Author:   @VirtualChen
 * Date:     2020/4/6 21:45
 */
package src;

import java.util.Stack;

public class Stackpushandpopsequence {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        //入栈数组的指针，必须维护，才知道此时应该是哪个数入栈
        int pushIndex = 0;
        //遍历要出栈的数组,如果可以全部出栈成功，那么返回TRUE
        for (int poppedIndex = 0; poppedIndex < popped.length; ++poppedIndex) {
            //这个条件很关键，当 还有数可以入栈 && (栈为空，那么直接入栈，或者栈顶元素与要弹出的数不一样，那么继续入栈)
            while (pushIndex < pushed.length && (stack.empty() || stack.peek() != popped[poppedIndex]))
                stack.push(pushed[pushIndex++]);
            //能走到这里，要么没有数可以继续入栈了，要么此时的栈顶元素和要弹出的数一致
            //如果栈顶元素和要弹出的数不一致，那么直接返回FALSE，因为正如上面所说，能走到这里还可能是因为没有数可以继续入栈了
            if (stack.peek() != popped[poppedIndex])
                return false;
                //如果一致，那么出栈
            else
                stack.pop();
        }
        //走到这里说明全部出栈成功，那么返回TRUE
        return true;
    }
}

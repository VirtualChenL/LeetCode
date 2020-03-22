package src;

/**
 * 将有序数组转化为二叉搜索树
 * @author VirtualChen 
 *
 */
public class ConvertSortedArraytoBinarySearchTree {
	 public TreeNode sortedArrayToBST(int[] nums) {
		 if(nums.length==0)
		 {
			 return null;
		 }
		 else
		 {
			 return tree(nums, 0, nums.length-1);
		 }
		 
	 }
	 public TreeNode tree(int[] nums,int l,int h) {
		 if(l<=h)
		 {
			 int mid=(l+h)/2;
			 TreeNode node=new TreeNode(nums[mid]);
			 node.left=tree(nums, 0, mid-1);
			 node.right=tree(nums, mid+1, h);
			 return node;
		 }
		 else
		 {
			 return null;
		 }
	 }
}

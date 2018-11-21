import java.util.LinkedList;
import java.util.List;

/**
 * 两个列表的最小索引和
 * @author Administrator
 *
 */
public class MinimumIndexSumofTwoLists {
	public String[] findRestaurant(String[] list1, String[] list2) {
       List<String> list=new LinkedList<>();
       int sum=Integer.MAX_VALUE;
       for(int i=0;i<list1.length;i++)
       {
    	   for(int j=0;j<list2.length;j++)
    	   {
    		   if(list1[i].equals(list2[j]))//使用==比较的是引用地址，使用equal比较的是内容
    		   {
    			   if(i+j<sum)
    			   {
    				   sum=i+j;
    			   }
    		   }
    	   }
       }
       for(int i=0;i<list1.length;i++)
       {
    	   for(int j=0;j<list2.length;j++)
    	   {
    		   if(list1[i].equals(list2[j])&&i+j==sum)
    		   {
    			  list.add(list1[i]);
    		   }
    	   }
       }
       String[] strings=new String[list.size()];
       for(int i=0;i<list.size();i++)
       {
    	   strings[i]=list.get(i);
       }
       return strings;
    }
}

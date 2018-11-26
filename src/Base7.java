/**
 * 七进制数
 * @author Administrator
 *
 */

public class Base7 {
	public String convertToBase7(int num) {
        StringBuffer buffer=new StringBuffer();
        if(num>=0)
        {
        	while(num>=7)
        	{
        		buffer.append(num%7);
        		num=num/7;
        	}
        	buffer.append(num);
        }
        else
        {
        	num=-num;
        	while(num>=7)
        	{
        		buffer.append(num%7);
        		num=num/7;
        	}
        	buffer.append(num);
        	buffer.append("-");
        }
        return buffer.reverse().toString();
    }
}

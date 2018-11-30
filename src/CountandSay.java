/**
 * 38.报数
 * @author VirtualChen 
 *
 */
public class CountandSay {
	public String countAndSay(int n) {
		if(n==1) {
			return "1";
		}
		String fir = "11";
		char[] ch = fir.toCharArray();
		int count = 1;
		int n1 = 0;
			while (n > 2) 
			{
				StringBuffer sb = new StringBuffer();
				for (int i = 1; i < ch.length; i++) 
				{
					n1 = ch[i];
					if (n1 == ch[i - 1]) {
						count++;
					} else {
						sb.append(count).append(ch[i - 1]);
						count = 1;
					}
					if (i == ch.length - 1) {
						sb.append(count).append(ch[i]);
					}
				}
				count=1;
				ch=sb.toString().toCharArray();
				n--;
			}
		return String.valueOf(ch);


    }
}

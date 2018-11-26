
public class ReverseInteger {
	public int reverse(int x) {
		int newx=Math.abs(x);
		String ss=String.valueOf(newx);
		StringBuffer buffer=new StringBuffer(ss);
		try {
		return (x>0) ? Integer.parseInt(buffer.reverse().toString()):-Integer.parseInt(buffer.reverse().toString());
		}
		catch (Exception e) {
			return 0;
		}
    }

}

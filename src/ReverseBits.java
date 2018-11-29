
/**
 * 颠倒二进制位
 * @author VirtualChen 
 *
 */
public class ReverseBits {
	public int reverseBits(int n) {
		String str = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        for (int i = 0; i < 32 - str.length(); i++) {
            sb.append(0);
        }
        return Integer.parseUnsignedInt(sb.toString(), 2);
    }
}

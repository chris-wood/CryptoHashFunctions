
public class ByteUtil {

	public static byte[] intToBytes(int n) {
		byte[] bytes = new byte[4];
		for (int i = 0; i < 4; i++) {
			bytes[i] = (byte) (n >> (8 * (4 - i - 1)));
		}
		return bytes;
	}

	public static byte[] longToBytes(long n) {
		byte[] bytes = new byte[8];
		for (int i = 0; i < 8; i++) {
			bytes[i] = (byte) (n >> (8 * (8 - i - 1)));
		}
		return bytes;
	}
}

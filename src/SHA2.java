
public class SHA2 implements HashFunction {
	
	public enum AlgorithmType { SHA_224, SHA_256, SHA_384, SHA_512 };
	public int digestSizes[] = { 224, 256, 384, 512 };

	private AlgorithmType algorithm;
	private int digestSize;

	public SHA2(AlgorithmType type) {
		algorithm = type;
		digestSize = digestSizes[type.ordinal()];
	}

	@Override
	public byte[] hash(byte[] input) {
		switch (algorithm) {
		case SHA_224:
			return digest224(input);
		case SHA_256:
			return digest256(input);
		case SHA_384:
			return digest384(input);
		case SHA_512:
			return digest512(input);
		}
		return null;
	}

	private static byte[] digest224(byte[] message) {
		return null;
	}

	private static byte[] digest256(byte[] message) {
		return null;
	}
	
	private static byte[] digest384(byte[] message) {
		return null;
	}
	
	private static byte[] digest512(byte[] message) {
		return null;
	}

	public AlgorithmType getAlgorithm() {
		return algorithm;
	}

	public int getDigestSize() {
		return digestSize;
	}
	
}
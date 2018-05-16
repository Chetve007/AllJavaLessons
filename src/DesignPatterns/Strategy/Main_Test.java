package DesignPatterns.Strategy;

public class Main_Test {

	public static void main(String[] args) {
		String key = "key";
	    String text = "text";
	    int alg = 1;
	    Encryption encryption = new Encryption(new DESAlgorithm());
	    String cryptedText = encryption.crypt(text, key);
	}
}

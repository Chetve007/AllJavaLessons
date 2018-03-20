package inputOutput10_1;

import java.io.IOException;
import java.io.InputStream;

public class ClassWorkIO {

	public static void main(String[] args) throws IOException {
	
		int op1 = getInt(System.in);
		String op = getString(System.in);
		int op2 = getInt(System.in);
		System.out.println(op1 + op2);
	}
	
	private static int getInt(InputStream is) throws IOException {
		return Integer.parseInt(getString(is));
	}
	
	   private static String getString(InputStream is) throws IOException {
	        int index = 0;
	        int data = is.read();
	        byte[] input = new byte[System.in.available()];

	        while(data != ' ' && data != '\n') {
	            input[index++] = (byte) data;
	            data = is.read();
	        }
	        return new String(input, 0, index);
	    }	
	
//	private static String getString(InputStream is) throws IOException {
//		int data = is.read();
//		int index = 0;
//		byte[] input = new byte[System.in.available() + 1];
//		input[index++] = (byte) data;
//		
//		
//		while((data = is.read()) != ' ' && (data = is.read()) != '\n') {
//			input[index++] = (byte) data;
//		}
//		return new String(input, 0, index);
//	}	
}
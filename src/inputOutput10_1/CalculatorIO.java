package inputOutput10_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CalculatorIO {

	  public  void calculate(InputStream in) throws IOException {
	        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

	        String line = reader.readLine();
	        StringTokenizer tokenizer = new StringTokenizer(line);

	        int op1 = Integer.parseInt(tokenizer.nextToken());
	        String op2 = tokenizer.nextToken().trim();
	        int op3 = Integer.parseInt(tokenizer.nextToken());

	        if (op2.equals("+")) {
	            System.out.println(summ(op1, op3));
	        } else if (op2.equals("-")) {
	            System.out.println(subtraction(op1, op3));
	        } else {
	            System.out.println(String.format("Method %s not supported", op2));
	        }
	    }

	private int summ(int op1, int op2) {
	        return op1 + op2;
	    }

	    private int subtraction(int op1, int op2) {
	        return op1 - op2;
	    }

	    public static void main(String[] args) throws IOException {
	        new CalculatorIO().calculate(System.in);
	    }

}

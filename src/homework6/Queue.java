package homework6;
import java.util.Scanner;

public class Queue {
	public static void main(String[] args) {
		
		int count = 1;
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the queue size ");
		int s = sc.nextInt();
		NamesRecorder namesRecorder = new NamesRecorder(s);
		System.out.println("Enter the name to add to the queue ");			
		
		while (true) {
			String line = sc.next();
			if (line.equalsIgnoreCase("exit"))
				break;
			namesRecorder.addName(line); 
		}
		
		System.out.println();
		System.out.println("Recorder names ");
		
		for (String name : namesRecorder.Names()) {
			System.out.println(name + " - is number " + count + " in the queue of " + s + " people.");
			count++;
		}
		System.out.println();
		System.out.println("Number all of people in the queue is " + namesRecorder.numOfPeople);
		System.out.println("Number of rename(s) is " + namesRecorder.numReName);
	}
}
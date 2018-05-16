package DesignPatterns.Builder;

public class Main_BuilderExample {
	
	public static void main(String[] args) {
		
		Director director = new Director();
		ComputerBuilder cheapComputerBuilder = new CheapComputerBuilder();
		
		director.setComputerBuilder(cheapComputerBuilder);
		director.constructComputer();
		
		Computer computer = director.getComputer();
	}
}

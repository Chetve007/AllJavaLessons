package homework6;

public class NamesRecorder {
	
	public int size;
	public int currentPos;
	public String[] names;
	public int numReName;
	public int numOfPeople = 0;
	
	public NamesRecorder(int size) {
		this.size = size;
		this.names = new String[size];
	}
	
	public void addName(String name) {
		numOfPeople++;
		if (numOfPeople > size)
			numReName = numOfPeople - size;
		if (currentPos == size)
			currentPos = 0;
		names[currentPos] = name;
		currentPos++;
	}
	
	public String[] Names() {
		return names;
	}
	

}

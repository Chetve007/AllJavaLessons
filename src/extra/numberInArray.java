package extra;
public class numberInArray {

	public static void main(String[] args) {
		
		int[] array = {1,2,5,7,9,34,23,12,10,21};
		int x = 107;
		
		boolean b = numberArray(array, x);
		
		System.out.println(b);
		
	}
	public static boolean numberArray(int[] array, int x) {
			  
		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(j == i)
					continue;
				if(array[i] + array[j] == x)
			        return true;
			}
		}
			return false;
	}
}

//public class Cache {
//	  private static Cache instance;
//	    
//	  private Cache() {
//	    // some magic
//	  }
//	  
//	  public static getInstance() {
//	    if (instance == null) {
//	      instance = new Cache();
//	    }
//	    
//	    return instance; 
//	  }
//	}

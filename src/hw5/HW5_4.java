package hw5;

public class HW5_4 {
	public static void main(String[] args) {
		int[] mas1 = {2,3,4,5,6,7,8,9};
		int[] mas2 = new int[100];
		 
		System.out.println("15 разных примеров из таблицы умножения: ");
		
		int x = 0, y = 0, z = 0, k = 0;
		for (int i = 0; k < 15; i++){
			work: { 
				x = (int)(Math.random() * mas1.length); 
				y = (int)(Math.random() * mas1.length);
				z = mas1[x] * mas1[y];
				for(int n = 0; n < mas2.length; n++) {
					if(z == mas2[n])
						break work;
		        }
				mas2[i] = z;
				k++;
				System.out.print(mas1[x] + " * " + mas1[y] + "\t");
			}
		}          		   
	}
}

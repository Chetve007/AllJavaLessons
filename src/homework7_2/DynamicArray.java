package homework7_2;

public class DynamicArray {
	public int pos = 0;
    public int[] array;

    public DynamicArray(int initialCapacity) {
        this.array = new int[initialCapacity];
    }

    public void add(int num) {
        array[pos] = num;
        pos++;
        if (pos == array.length) {
            int [] newArray = new int[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }

    public int[] getAllElements() {
        int [] newArray = new int[pos];
        System.arraycopy(array, 0, newArray, 0, pos);
        return newArray;
    }
    
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(4);

        dynamicArray.add(10);
        dynamicArray.add(11);
        dynamicArray.add(12);
        dynamicArray.add(13);
        dynamicArray.add(14);
        dynamicArray.add(15);
        dynamicArray.add(16);
        dynamicArray.add(17);
        dynamicArray.add(18);
        dynamicArray.add(19);
        dynamicArray.add(20);

        for (int num : dynamicArray.getAllElements()) {
            System.out.print(num + " ");
        }
    }
}

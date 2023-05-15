package datastructures.arrays.onedarray;

public class Main {
	public static void main(String[] args) {
		SingleDimensionArray sda = new SingleDimensionArray(5);
		sda.insert(0, 0);
		sda.insert(1, 10);
		sda.insert(2, 20);
		sda.insert(2, 30);
		sda.insert(4, 40);
		sda.insert(12, 0);
		
		sda.searchInArray(20);
		sda.searchInArray(45);
		
		sda.delete(2);
		sda.delete(12);
		System.out.println(sda.arr[2]);
	}
}

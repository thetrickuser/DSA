package datastructures.arrays.onedarray;

public class SingleDimensionArray {
	int arr[] = null;
	
	public SingleDimensionArray(int size) {
		arr = new int[size];
		for (int i=0; i<size; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}
	
	public void insert(int idx, int value) {
		try {
			if (arr[idx] == Integer.MIN_VALUE) {
				arr[idx] = value;
				System.out.println("Successfully inserted");
			} else {
				System.out.println("This index is already occupied");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
	}
	
	public void searchInArray(int valueToSearch) {
		try {
			for (int i=0; i<arr.length; i++) {
				if (arr[i] == valueToSearch) {
					System.out.println("Value " + valueToSearch + " found at index " + i);
					return;
				}
			}
			System.out.println("Value not found in array");
		} catch(Exception e) {
			System.out.println("Array does not exist");
		}
	}
	
	public void delete(int indexToDelete) {
		try {
			arr[indexToDelete] = Integer.MIN_VALUE;
			System.out.println("Successfully deleted");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
	}

}

package datastructures.arrays.twodarray;

public class TwoDimensionArray {
	int arr[][] = null;
	
	public TwoDimensionArray(int row, int col) {
		arr = new int[row][col];
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				arr[i][j] = Integer.MIN_VALUE;				
			}
		}
	}
	
	public void insert(int row, int col, int value) {
		try {
			if (arr[row][col] == Integer.MIN_VALUE) {
				arr[row][col] = value;
				System.out.println("Successfully inserted");
			} else {
				System.out.println("This index is already occupied");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
	}
	
	public void accessCell(int row, int col) {
		try {
			System.out.println(
					"Element at row: " + row + ", column: " + col + " = " + arr[row][col]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
	}
	
	public void searchInArray(int valueToSearch) {
		try {
			for (int i=0; i<arr.length; i++) {
				for (int j=0; j<arr[i].length; i++) {
					if (arr[i][j] == valueToSearch) {
						System.out.println("Value " + valueToSearch + " found at index " + i);
						return;
					}					
				}
			}
			System.out.println("Value not found in array");
		} catch(Exception e) {
			System.out.println("Array does not exist");
		}
	}
	
	public void delete(int row, int col) {
		try {
			arr[row][col] = Integer.MIN_VALUE;
			System.out.println("Successfully deleted");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
	}

}

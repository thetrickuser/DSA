package datastructures.arrays.question;

import java.util.stream.Stream;

public class RotateMatrix {
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		printMatrix(matrix);
		rotate(matrix);
	}
	
	public static void printMatrix(int[][] matrix) {
		Stream.of(matrix).forEach(arr -> {
			for (int num: arr) System.out.print(num + ",");
			System.out.println();
		});
		
		System.out.println();
	}
	
	public static void rotate(int[][] matrix) {
		int n = matrix.length;
		for (int layer = 0; layer < n/2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for (int i=first; i<last; i++) {
				int offset = i-first;
				int top = matrix[first][i];
				matrix[first][i] = matrix[last - offset][first];
				printMatrix(matrix);
				matrix[last - offset][first] = matrix[last][last - offset];
				printMatrix(matrix);
				matrix[last][last - offset] = matrix[i][last];
				printMatrix(matrix);
				matrix[i][last] = top;
				printMatrix(matrix);
			}
		}
	}
}

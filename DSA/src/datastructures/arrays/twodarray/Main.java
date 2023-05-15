package datastructures.arrays.twodarray;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		TwoDimensionArray tda = new TwoDimensionArray(2,2);
		tda.insert(0, 0, 0);
		tda.insert(0, 1, 10);
		tda.insert(1, 0, 30);
		tda.insert(1, 1, 40);
		System.out.println(Arrays.deepToString(tda.arr));
		
		
//		tda.searchInArray(20);
//		tda.searchInArray(45);
//		
//		tda.delete(2);
//		tda.delete(12);
	}
}

package datastructures.arrays.project;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("How many days?");
		int days = console.nextInt();
		double tempArr[] = new double[days];
		double avgTemp = 0;
	
		for (int i=0; i<days; i++) {
			System.out.println("Day " + (i+1) + "'s temp?");
			tempArr[i] = console.nextInt();
			avgTemp += (tempArr[i] / days);			
		}
		
		int highTempDays = 0;
		for (int i=0; i<tempArr.length; i++) {
			if (tempArr[i] < avgTemp) {
				highTempDays++;
			}
		}
		
		System.out.println("Avg Temperature: " + avgTemp);
		System.out.println("Days with high temperature: " + highTempDays);
		
		console.close();
	}
}

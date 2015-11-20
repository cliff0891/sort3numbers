

import java.util.Scanner;
import java.util.Arrays;

	

		public class sort3numbers {
			public static void main(String[] args) {
				System.out.print("Hello class, "); 
				System.out.println("this is a sorting algorithm using arrays.");
				
				// call the sorting algorithm
				SortAlgorithm();
				}
			public static void SortAlgorithm() {

				// generate a set of random numbers to sort
				int listSize = 6;
				int[] numberArray = new int[listSize];
				numberArray = buildRandomArray(listSize);
				System.out.print("Our random array is: ( ");
				for (int i = 0; i < listSize; i++ ){
					System.out.print(numberArray[i] + " ");
				}
				System.out.println(").");
				
				
				// sort our array of numbers
				numberArray = sortOurArray(numberArray, listSize);
				System.out.print("Our sorted array is: ( ");
				for (int i = 0; i < listSize; i++ ){
					System.out.print(numberArray[i] + " ");
				}
				System.out.println(").");
				
			}
			public static int[] buildRandomArray(int listSize) {
				int[] numberArray = new int[listSize];
				// populate the array
				numberArray = populateRandomArray(numberArray, listSize);
				
				// Test the array to see if there are duplicates.
				
				return numberArray;
			}
			public static int[] populateRandomArray(int[] numberArray, int listSize) {
				
				int randomRange = listSize * 1000;
				for (int i = 0; i < listSize; i++ ){
					numberArray[i] = (int)(Math.random()*randomRange);
				}
				return numberArray;
			}
			
			public static int[] sortOurArray(int[] numberArray, int listSize) {
				
				int holder_1;
				int holder_2;
				for (int passCounter = 1; passCounter <= listSize; passCounter++ ){
					
					for (int i = 0; i < listSize-1; i++ ){
						
						holder_1 = numberArray[i];
						holder_2 = numberArray[i+1];
						
						if(holder_2 < holder_1){
							numberArray[i] = holder_2;
							numberArray[i+1] = holder_1;
							/* Remove our printing block
							System.out.print("We had a switch, the new array is: /n( ");
							
							for(int j = 0; j < listSize; j++){
								
								if (j == i){
									System.out.print(" " + numberArray[j] + " ");
								}else if (j == (i+1)){
									System.out.print(" " + numberArray[j] + " ");
								}else{
									System.out.print(numberArray[j] + "  ");
								}
							}
							System.out.println(")");
							*/
						}
						
					}
				}
				return numberArray;
			}
		}
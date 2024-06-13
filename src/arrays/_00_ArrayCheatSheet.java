package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
	Random ran = new Random();
	ran.nextInt(50);
		String[] strings = {"A", "B", "C", "D", "E"};
		//2. print the third element in the array
		System.out.println(strings[2]);
		//3. set the third element to a different value
		strings[2]= "F";
		//4. print the third element again
		System.out.println(strings[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i<strings.length; i++) {
			System.out.println(strings[i]);
		}
		
		//6. make an array of 50 integers
		int[] ints = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int a = 0 ; a <50; a++) {
			ints[a] = ran.nextInt(50);
			System.out.println(ints[a]);
		}
		//8. without printing the entire array, print only the smallest number in the array
int c = 25;
		for(int b = 0; b<50; b++) {
	
	if(ints[b]<c) {
		c = ints[b];
	} 
}
System.out.println(c);
		//9 print the entire array to see if step 8 was correct

//10. print the largest number in the array.
	int e = 25; 
	for (int f = 0; f<50; f++) {
		if(ints[f]>e) {
			e = ints[f];
		}
	}
	System.out.println(e);
	}
}

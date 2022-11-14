package week1.day2;

import org.apache.commons.lang3.ArraySorter;

public class SecondLargest {
	
	
	public static void secondlargestnumber(int number[],int len)
	{
		//sorting in ascending order
		int[] numbersort = ArraySorter.sort(number);	
		
		if(numbersort[len-2] < numbersort[len-1]) {
			System.out.println("The Second largest value is: " + numbersort[len-2]);		
		}
	}
	public static void main(String[] args) {	
		int number[] = {3,2,11,4,8,7,12};	
		int len = number.length;	
		secondlargestnumber(number,len);
	}
}
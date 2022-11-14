package week1.day2;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		int numb = -45;
		if(numb<0) {
			numb = numb * -1 ;
			System.out.println("The converted numbers is "+numb);
		}
	}
}

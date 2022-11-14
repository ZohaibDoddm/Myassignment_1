package week1.day2;
public class Primenumber {

	public static void main(String[] args) {

		int number = 22;
		int count = 0;
		for(int i=1;i<=number;i++)
		{
			if(number % i == 0)
				count++;
		}
		if(count == 2)
		{
			System.out.println("prime numner");
		}
		else {
			System.out.println("not a prime number");
		}
	}
}

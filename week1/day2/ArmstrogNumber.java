package week1.day2;
public class ArmstrogNumber {


	public int countdigits(int num)
	{
		int count=0;
		int temp = num;
		while(temp> 0)
		{
			count = count+1;
			temp = temp / 10;
		}
		System.out.println("count is " +count);
		return count;		
	}

	public void armstrong(int num) {
		
		int counted = countdigits(num);
		int num2 =num;
		double sum=0;
		
		while(num2 > 0)
		{
			int rem = num2 % 10;
			sum = sum + Math.pow(rem, counted);	
			num2 = num2/10;	
		}
		System.out.println("the value of the number is " +sum);

		if(num == sum)
		{
			System.out.println("IT IS AN ARMSTRONG NUMBER");
		}
		else {
			System.out.println("IT IS NOT AN ARMSTROG NUMBER");
		}
	}

	public static void main(String[] args) {	
		ArmstrogNumber arm = new ArmstrogNumber();
		int num = 153;
		arm.armstrong(num);
	} 

}


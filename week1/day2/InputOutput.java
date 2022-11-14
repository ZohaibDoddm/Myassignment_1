package week1.day2;

public class InputOutput {

	public float sum(int num1,int num2,float num3) {
		float sum = num1+num2+num3;
        return sum;
     		   }
	
	public double multiply(double num1,double num2,double num3) {
		double product = num1*num2*num3;
		return product;
	}

	public void getemployeeinfo(String fname,String lname)
	{
		System.out.println("The employee fullname is " +fname+  " " +lname);
	}
	
	public double percentage() {
		double result1 = multiply(22.44,44.33,66.87);
		float result2 = sum(33,44,55.32f);
		double perc = result1 / result2;
		return perc;
	}
	
	public static void main(String[] args) {
		InputOutput inp = new InputOutput();
	//	inp.sum(22,44,66.433f);
		double resulfinal= inp.percentage();
	    System.out.println(resulfinal);
	}

}

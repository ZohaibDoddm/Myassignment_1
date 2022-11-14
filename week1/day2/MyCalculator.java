package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator mycalc = new Calculator();
		
		double productm =  mycalc.mul(23.34, 34.32); 
		int addition = mycalc.add(23,55,77);
		float division =  mycalc.divide(222.3f,34.32f);
		int substract =  mycalc.sub(25,21);

		System.out.println("product value "+productm);
		System.out.println("addition value "+addition);
		System.out.println("Division value "+division);
		System.out.println("subtract value " +substract);

	}

}

package week1.day1;

public class Mobile {
	
	String mobileBrandName = "Samsung";
	char mobileLogo = 'S';
	short noOfMobilePiece = 23890;
	int modelNumber = 1887632131;
	long mobileImeiNumber = 2398017998872L;
	float mobilePrice = 58330;
	boolean isDamaged = false;
	
	
	public static void main(String[] args) {
		Mobile mob= new Mobile();
		System.out.println("The mobile brand name is " +mob.mobileBrandName);
		System.out.printf("The IMEI number is ", +mob.mobileImeiNumber);
		System.out.println("The mobile logo is " +mob.mobileLogo);
		System.out.println("The mobile price is " +mob.noOfMobilePiece);
		System.out.println("The mobile model number is " +mob.modelNumber);
		System.out.println("The mobile brand name is" +mob.mobileBrandName);
		System.out.println("The IMEI number is" +mob.mobileImeiNumber);
		System.out.println("The mobile is damaged ?" +mob.isDamaged);
		System.out.println("The mobile price is " +mob.mobilePrice);
 
	}
}

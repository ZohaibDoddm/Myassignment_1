package week1.day1;

public class TwoWheeler {
    int noOfWheels = 2;
    short noOfMirrors = 2;
    long chassisNumber = 2468329879L;
    boolean isPunctured = false;
    String bikeName = "Yamaha FZ25";
    double runningKM = 1243237;

    
    public static void main(String[] args) {
    	TwoWheeler twowhe = new TwoWheeler();   	
		System.out.println("The no. of wheels are :" +twowhe.noOfWheels);
		System.out.println("The no. mirrors are :" +twowhe.noOfMirrors);
		System.out.println("The chassis number is :" +twowhe.chassisNumber);
		System.out.println("The bike is punctured? : " +twowhe.isPunctured);
		System.out.println("The bike name is :" +twowhe.bikeName);
		System.out.println("The distance in Kms covered is :" +twowhe.runningKM);
	}
}

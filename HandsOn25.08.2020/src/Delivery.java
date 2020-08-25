import java.util.Scanner;
class Delivery {
	long over;
	long ball;
	long runs;
	String batsman;
	String bowler;
	String nonStriker;
	Delivery(long OVER, long BALL, long RUNS, String Batsman, String Bowler, String NonStriker)
	{
     over = OVER;
	 ball = BALL;
	 runs = RUNS;
	 batsman = Batsman;
	 bowler = Bowler;
	 nonStriker = NonStriker;
	}
	void displayDeliveryDetails(){
		System.out.println("Delivery Details");
		System.out.println("OVERS: " + over);
		System.out.println("Ball: " + ball);
        System.out.println("Runs: " + runs);	
		System.out.println("Batsman: " + batsman);
		System.out.println("Bowler: " + bowler);
        System.out.println("NonStriker: " + nonStriker);		
	}
	
	}
	
	class Main{
	public static void main(String args[])
	{ 
	    
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Over:");
	    long over = sc.nextLong();
	    System.out.println("Enter the ball:");
	    long ball = sc.nextLong();
		System.out.println("Enter the runs:");
	    long runs = sc.nextLong();
		System.out.println("Enter batsman Name:");
	    String batsman = sc.next();
	    System.out.println("Enter bowler Name:");
	    String bowler = sc.next();
		System.out.println("Enter the nonStriker name:");
	    String nonStriker = sc.next();
		Delivery delivery=new Delivery(over,ball,runs,batsman,bowler,nonStriker);
		delivery.displayDeliveryDetails();
	}
}
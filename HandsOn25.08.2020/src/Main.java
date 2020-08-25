import java.util.*;
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
		Deliver delivery=new Deliver(over,ball,runs,batsman,bowler,nonStriker);
		delivery.setBall(ball);
		delivery.setOver(over);
		delivery.setRuns(runs);
		delivery.setBatsman(batsman);
		delivery.setBowler(bowler);
		delivery.setNonStriker(nonStriker);
		long Ball = delivery.getBall();
		long Over = delivery.getOver();
		long Runs = delivery.getRuns();
		String Batsman = delivery.getBatsman();
		String Bowler = delivery.getBowler();
		String NonStriker = delivery.getNonStriker();
		System.out.println("Delivery Details");
		System.out.println("OVERS: " + Over);
		System.out.println("Ball: " + Ball);
        System.out.println("Runs: " + Runs);	
		System.out.println("Batsman: " + Batsman);
		System.out.println("Bowler: " + Bowler);
        System.out.println("NonStriker: " + NonStriker);	
		
	}
}
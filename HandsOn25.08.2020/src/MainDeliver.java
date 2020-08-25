import java.util.*;
class MainDeliver{
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
		deliver.displayDeliveryDetails();
	}
}
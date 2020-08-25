import java.util.Scanner;
class Venue {
	String name;
	String City;
	
	}
class Main{
	public static void main(String args[])
	{
		Venue venue = new Venue(); 
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Venue Name:");
	    venue.name = sc.next();
	    System.out.println("Enter City Name:");
	    venue.City = sc.next();
		System.out.println("Venue Details");
		System.out.println("Venue Name: " + venue.name);
		System.out.println("Venue City: " + venue.City);	
	}
}

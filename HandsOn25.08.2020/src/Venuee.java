import java.util.Scanner;
class Venuee {
	private String Name;
	private String City;
	
	public String getName()
	{
		return Name;
	}
	public String getCity()
	{
		return City;
	}
	public void setName(String Name){
		this.Name = Name;
	}
	public void setCity(String City){
		this.City = City;
	}
	void displayDetails(String NAME, String CITY)
	{
		System.out.println("Venue Details");
		System.out.println("Venue Name: " + Name);
		System.out.println("Venue City: " + CITY);
	}
	
}
class Main{
	public static void main(String args[])
	{
		Venuee venue = new Venuee(); 
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Venue Name:");
	    String name = sc.next();
	    System.out.println("Enter City Name:");
	    String city = sc.next();
		venue.setName(name);
		venue.setCity(city);
		String n = venue.getName();
		String c = venue.getCity();
		venue.displayDetails(n,c);	
		
		int i=1;
		for(;i!=0;)
		{
			System.out.println("Verify and Update Venue Details");
			System.out.println("Menu");
			System.out.println("1. Update Venue Name");
			System.out.println("2. Update City Name");
			System.out.println("3. All informations are Correct/Exit");
			System.out.println("Type 1 or 2 or 3");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
				    System.out.println("Enter Venue Name: ");
					String name1 = sc.next();
					venue.setName(name1);
					String n1 = venue.getName();
					venue.displayDetails(n1,venue.getCity);
					break;
				case 2:
				    System.out.println("Enter City Name: ");
					String city1 = sc.next();
					venue.setCity(city1);
					String c1 = venue.getCity();
					venue.displayDetails(venue.getName,c1);
					break;
				case 3:
				    i=0;
					venue.displayDetails(venue.getName,Venue.getCity);
					break;
			}
		}
				     
	
	}
}

import java.util.Scanner;
class Player {
	String Name;
	String Country;
	String Skill;
	
	}
class Main{
	public static void main(String args[])
	{
		Player player = new Player(); 
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Player Name:");
	    player.Name = sc.next();
	    System.out.println("Enter Country Name:");
	    player.Country = sc.next();
		System.out.println("Enter Skill:");
	    player.Skill = sc.next();
		System.out.println("Player Details");
		System.out.println("Player Name: " + player.Name);
		System.out.println("Player Country: " + player.Country);
        System.out.println("Player Skills: " + player.Skill);		
	}
}

import java.util.*;
class Players {
	String Name;
	String Country;
	String Skill;
	
	}
class Main{
	public static void main(String args[])
	{
		Players player = new Players(); 
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Player Details:");
	    String Details = sc.next();
		String[] result = Details.split(",");
		player.Name= result[0];
		player.Country = result[1];
		player.Skill = result[2];
		System.out.println("Player Name: " + player.Name);
		System.out.println("Player Country: " + player.Country);
        System.out.println("Player Skills: " + player.Skill);
	}
}
		
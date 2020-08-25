import java.util.*;
class MainW{
	public static void main(String args[])
	{ 
	    
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of wicket: ");
		int i=1;
		int wickets = sc.nextInt();
		while(wickets>0)
		{
		System.out.println("Enter the details of wicket " +i+":");
	    String Details = sc.next();
		wickets--;
		i++;
		System.out.println("Wicket Details ");
		String[] result = Details.split(",");
		long over = Long.parseLong(result[0]);
		long ball= Long.parseLong(result[1]);
		String wicketType = result[2];
		String playerName = result[3];
		String bowlerName = result[4];
		Wicket wicket = new Wicket(over,ball,wicketType,playerName,bowlerName);
		wicket.setBall(ball);
		wicket.setOver(over);
		wicket.setWicketType(wicketType);
		wicket.setBowlerName(bowlerName);
		wicket.setPlayerName(playerName);
		long Ball = wicket.getBall();
		long Over = wicket.getOver();
		String WicketType = wicket.getWicketType();
		String BowlerName = wicket.getBowlerName();
		String PlayerName = wicket.getPlayerName();
		System.out.println("OVERS: " + Over);
		System.out.println("Ball: " + Ball);	
		System.out.println("wicket type: " + WicketType);
		System.out.println("Bowler Name: " + BowlerName);
        System.out.println("Player Name: " + PlayerName);	
		}
	}
}
import java.lang.*;
import java.util.*;
class CustomException extends java.lang.Exception{
	private String message;
	CustomException(String m){
		message = m;
	}
	public String toString(){
		
		return "TeamNotFoundException:"+message+".";
		
	}
	
}
class TeamNotFound{
	static int validateTeam(String team) throws CustomException{
		String[] Teams = {"Chennai Super Kings","Deccan Chargers","Delhi Daredevils","Kings XI Punjab",
		                   "Kolkata Knight Riders","Mumbai Indians","Rajasthan Royals","Royal Challengers Bangalore"};
		int flag,i;
		for(flag=0, i=0;i<Teams.length;i++)
		{
	       if(Teams[i].equalsIgnoreCase(team))
			flag=1;
		}
		if(flag == 0)
		{
			throw new CustomException("Entered Team is Not part of IPL Season 4");
			
		}
		else{
			
			return 1;
		}
	
	}
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Expected Winner Team for IPL Season 4: ");
		String winner= sc.nextLine();
		try{
			int w =validateTeam(winner);
		    if(w == 1)
		    {
		       System.out.println("Enter the Expected Runner Team for IPL Season 4: ");
		       String runner = sc.nextLine();
		       try{
			      int r = validateTeam(runner);
			      if(r==1)
			      {
				      System.out.println("Expected IPL Season 4 Winner is: "+winner);
		              System.out.println("Expected IPL Season 4 Runner is: "+runner);
				  }
				}
		       catch(java.lang.Exception e)
		       {
			      System.out.println(e);
		       }
		
		   }
		}
		catch(java.lang.Exception e)
		{
			System.out.println(e);
		}
		
	}
}
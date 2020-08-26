import java.util.*;
class UserCity{
	static boolean validateCity(String cityName)
	{
		int length = cityName.length();
		char[] city = cityName.toCharArray();
		char asetrick = '*';
		boolean firstTwoChar = (Character.isLetter(city[0]) && Character.isLetter(city[1]))?true:false;
		boolean lastTwoChar = (Character.isLetter(city[length-1]) && Character.isLetter(city[length-2]))?true:false;
        if(firstTwoChar && lastTwoChar){
			int i,flag;
		for(flag=0,i=3;i<=length-3;i++)
			{
				if(city[i]==asetrick)
					flag=1;
				else{
					flag=0;
				    break;
				}
		   }
		   if(flag==1)
		   return true;
	      else
		   return false;
		}
		else
			return false;
		
	}
}

class Main{
	public static void main(String[ ] args)
	{
		UserCity user = new UserCity();
	   Scanner sc = new Scanner(System.in);
	   String cityName = sc.next();
	  boolean check = user.validateCity(cityName);
	if(check == true)
		System.out.println("Valid");
	else
		System.out.println("Invalid");
	}
	
}
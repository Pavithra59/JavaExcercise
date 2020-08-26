import java.util.*;
class UserPlayerMain{
	static boolean validatePlayer(String name)
	{
       int length = name.length();
	   char[] player = name.toCharArray();
	   int i,flag=1;
       for(flag=0,i=0;i<length;i++)
			{
				   if(player[i] == 'a'|| player[i] == 'A')
				   {
					   if((i+1)%2==0)
					   {
					   flag = 0;
					   break;
					   }
				       else
						   flag=1;
				   }
			}
		if(flag == 0)
			return false;
		else
			return true;
	}
}
class Main{
	public static void main(String[ ] args)
	{
		UserPlayerMain user = new UserPlayerMain();
	   Scanner sc = new Scanner(System.in);
	   String PlayerName = sc.next();
	   boolean check = user.validatePlayer(PlayerName);
	if(check == true)
		System.out.println("Valid");
	else
		System.out.println("Invalid");
	}
	
}
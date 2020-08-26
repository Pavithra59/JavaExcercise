import java.text.*;
import java.util.*;
class UserMainCode 
{
	static boolean validateDate(String date)
	{
		try{
		 String dateVar = date;
		 Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(date);  
		 DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); 
		 String checkDate = dateFormat.format(date1);  
		 if(dateVar.equals(checkDate))
		    return true;
		else
		    return false;
	   }
	   catch(Exception e)
	   {
		   return false;
	   }
	
	}
}
class Main{
	public static void main(String[ ] args)
	{
		UserMainCode user = new UserMainCode();
	Scanner sc = new Scanner(System.in);
	String date = sc.next();
	boolean check = user.validateDate(date);
	if(check == true)
		System.out.println("Valid");
	else
		System.out.println("Invalid");
	}
	
}
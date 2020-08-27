import java.lang.*;
import java.util.*;
class CustomException extends java.lang.Exception{
	private String message;
	private int playerAge;
	CustomException(int a, String m){
		playerAge = a;
		message = m;
	}
	public String toString(){
		return "CustomException:"+message+".";
	}
}
class InvalidAgeRange{
	static void validateAge(int a,String n) throws CustomException{
		
		if(a<19){
			throw new CustomException(a,"InvalidAgeRangeException");
		}
		else{
			System.out.println("Player Name: "+n);
			System.out.println("Player Age: "+a);
		}
	}
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Player Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Player Age: ");
		int age = sc.nextInt();
		try{
			validateAge(age,name);
		}
		catch(java.lang.Exception e)
		{
			System.out.println(e);
		}
	}
}
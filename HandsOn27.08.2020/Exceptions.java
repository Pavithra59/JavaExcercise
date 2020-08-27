import java.util.*;
import java.lang.*;
class Exceptions
{
	public static void main(String args[])
	{
		try{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Over: ");
		int over = sc.nextInt();
		int runs[] = new int[over+1];
		System.out.println("Enter the runs for each Over: ");
		for(int i=1;i<=over;i++)
		{
			runs[i] = sc.nextInt();
		}
		System.out.println("Enter the over Number: ");
		int overNum = sc.nextInt();
		System.out.println("Runs Scored in this over: "+runs[overNum]);
		}
		catch(java.lang.Exception e)
		{
			System.out.println(e);
		}
		
	}
}
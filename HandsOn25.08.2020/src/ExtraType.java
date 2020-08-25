import java.util.Scanner;
class ExtraType {
	String Name;
	long Runs;
	public String getName()
	{
		return Name;
	}
	public long getRuns()
	{
		return Runs;
	}
	public void setName(String Name){
		this.Name = Name;
	}
	public void setRuns(long Runs){
		this.Runs = Runs;
	}
	
}
class Main{
	public static void main(String args[])
	{
		ExtraType extra = new ExtraType(); 
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the extratype Details:");
	    String Details = sc.next();
		String[] result = Details.split("#");
		extra.setName(result[0]);
		long runs= Long.parseLong(result[1]);
		extra.setRuns(runs);
		String name = extra.getName();
		long run = extra.getRuns();
		System.out.println("Extra Type: " + name);
		System.out.println("Runs: " + run);
        
	}
}
		
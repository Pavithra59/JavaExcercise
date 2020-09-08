import java.util.*;
class Teams {
  String name;
  long numberOfMatches;
  public Teams(String name, long numberOfMatches) {
        this.name = name;
        this.numberOfMatches = numberOfMatches;
    }
	@Override
    public String toString() {
         return name + " - " + numberOfMatches;
}
}
public class Main {
       public static void main(String... args) {
		    List<Teams> l=new ArrayList<>();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of Teams: ");
    	    int n = sc.nextInt();
    	    int i;
    	    for(i=0;i<n;i++) {
				System.out.println("Enter team "+(i+1)+" detail: ");
				System.out.println("Enter name: ");
				String n1=sc.next();
				System.out.println("Enter number of matches: ");
				long m = sc.nextLong();
    		    l.add(new Teams(n1,m));
			}
			Collections.sort(l,new TeamComparator());
			    System.out.println("Teams list after sort by number of matches");
                for(Teams t:l)
                    System.out.println(t);
	   }
}
class TeamComparator implements Comparator<Teams>{
    @Override
    public int compare(Teams t1, Teams t2) {
        if(t1.numberOfMatches==t2.numberOfMatches)
            return 0;
        else if(t1.numberOfMatches > t2.numberOfMatches)
            return 1;
        else
            return -1;
    }
}
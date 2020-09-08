import java.util.*;    
class Player {      
    String name,team,skill;     
    public Player(String name, String team, String skill) {      
        this.name = name;    
        this.team = team;    
        this.skill = skill;    
   }    
}    

public class PlayerDetails {    
    public static void main(String[] args) {
		Map<String,Player> map=new TreeMap<String,Player>();  
        Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of Players: ");
    	    int n = sc.nextInt();
    	    int i;
    	    for(i=0;i<n;i++) {
				System.out.println("Enter detail of player "+(i+1)+" : ");	
				String capNum = sc.next();
				String n1 = sc.next();
				String t = sc.next();
				String sk = sc.next();
				map.put(capNum,new Player(n1,t,sk));
			}			
	    for(Map.Entry<String, Player> entry:map.entrySet()){    
            String key = entry.getKey();  
            Player p = entry.getValue();   
            System.out.println(key+"--"+p.name+"--"+p.team+"--"+p.skill);   
        }  
    }	
}
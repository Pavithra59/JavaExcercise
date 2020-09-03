import java.util.*;
class Sort {
    public static void main(String args[]) {
    	ArrayList<Integer> l = new ArrayList<Integer>();
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int i;
    	for(i=0;i<n;i++) {
    		l.add(sc.nextInt());	
    	}
		Collections.sort(l);
		System.out.println();
		for(i=0;i<n;i++) {
			System.out.println(l.get(i));
    	}
    }
}
import java.util.*;
class Frequency {
    public static void main(String args[]) {
    	ArrayList<String> l = new ArrayList<String>();
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int i,freq;
    	for(i=0;i<=n;i++) {
    		l.add(sc.nextLine());	
    	}
		String venue = sc.nextLine();
		freq = Collections.frequency(l,venue);
		System.out.println(freq);
	}
}
import java.util.*;
class CskAverage {
    public static void main(String args[]) {
    	ArrayList<Integer> l = new ArrayList<Integer>();
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int i,sum;
    	for(sum=0,i=0;i<n;i++) {
    		l.add(sc.nextInt());	
    		sum+=l.get(i);
    	}
    	float average = sum/n;
    	System.out.println(sum);
    	System.out.println(average); 	
    }
}
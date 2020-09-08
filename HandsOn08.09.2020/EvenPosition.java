import java.util.*;
class EvenPosition{
    public static void main(String args[]) {
    	ArrayList<Integer> l = new ArrayList<Integer>();
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int i,evenSum=0;
    	for(i=0;i<n;i++) {
    		l.add(sc.nextInt());
            if((i+1)%2 == 0)
			{
				evenSum+=l.get(i);
			}			
    	}
		System.out.println(evenSum);
	}
}
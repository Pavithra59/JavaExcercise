import java.util.*;
class OddEvenSums{
    public static void main(String args[]) {
    	ArrayList<Integer> l = new ArrayList<Integer>();
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int i,oddSum=0,evenSum=0;
    	for(i=0;i<n;i++) {
    		l.add(sc.nextInt());
            if((i+1)%2 != 0 && (l.get(i))%2 == 0)
			{
				oddSum+=l.get(i);
			}	
            else if((i+1)%2 == 0 && (l.get(i))%2!= 0)
			{
				evenSum+=l.get(i);
			}
            else{}			
    	}
		if(oddSum != 0 && evenSum != 0)
		{
			System.out.println(oddSum + evenSum);
		}
		else if(oddSum != 0)
			System.out.println(oddSum);
		else
		   System.out.println(evenSum);	
		
	}
}
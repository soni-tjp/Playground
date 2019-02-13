import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
      int m = in.nextInt();
	    // Take numbers from 2 to given number
	    // Check each number until it reaches the given number
	    power(n,m);
      
	    
	}
	// Function to find the prime number
	public static void power(int b,int e)
	{int a=1;
	    for(int i=1;i<=e;i++)
        {
          a=a*b;
        }
     System.out.println(a);
	    
	}
}// End of Main class
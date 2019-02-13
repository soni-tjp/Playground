import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner ni= new Scanner (System.in);
      int n = ni.nextInt();
      int sum;
       int last_digit;
         last_digit = (n%10);
      while(n>10)
      {
         n=n/10;    
	}
int first_digit = n;
     sum = ( first_digit+ last_digit);
  System.out.println(sum);
    }
}
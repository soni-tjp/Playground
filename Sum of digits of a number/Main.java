import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner ni= new Scanner (System.in);
      int n = ni.nextInt();
      int sum=0;
       int last_digit;
         last_digit = (n%10);
      while(n>0)
      {
         n=n/10;
        sum=sum+(n%10);
	}
     sum = ( sum+ last_digit);
  System.out.println(sum);
    }
}
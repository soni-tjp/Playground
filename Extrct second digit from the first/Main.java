import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner ni= new Scanner(System.in);
      int n = ni.nextInt();
     
      while(n>=100)
      {
         n=n/10;    
	}
int second_digit = n%10;
      System.out.println(second_digit);
    }
}
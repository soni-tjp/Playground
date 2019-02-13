import java.util.Scanner;
class Main
{
  public static int squr_no(int num)
  {
    int sqr=num*num;
    return sqr;}

	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner mi=new Scanner(System.in);
      int n=mi.nextInt();
      int sqr=squr_no(n);
      System.out.println(sqr);
	} 
}
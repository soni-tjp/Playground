import java.util.Scanner;
class Main
{
  public static int sum_no(int num)
  {
    int s=0;
    {for(int i=1;i<=num;i++)
      s=s+i;}
    return s;}

	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner mi=new Scanner(System.in);
      int n=mi.nextInt();
      
      int sum=sum_no(n);
      System.out.println(sum);
	} 
}
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner mi = new Scanner (System.in);
    int n = mi.nextInt();
    for(int i=1;i<=n;i++)
    {
      if(i%3==0)
      {  System.out.print(i);
        System.out.print(",");
      }else
         System.out.print(i);
        
    }
    }
}
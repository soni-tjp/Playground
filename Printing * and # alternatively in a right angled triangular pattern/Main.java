import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n = in.nextInt();
      int m=0;
      for(int j = 1;j<= n;j++)
      {
        for (int i=1;i<=j;i++)
        {m=m+1;
        if (m%2==0)
          System.out.print("#");
        else
          System.out.print("*");
    }
        System.out.println();
      }
}
}
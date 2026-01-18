import java.util.Scanner;
{
  public static void main(String args[])
    {
    Scanner ob=new Scanner(System.in);
    System.out.println("Input a number to be checked as even or odd");
    int n=ob.nextInt();
    if(n%2==0)
      System.out.println("EVEN NUMBER");
    else
      System.out.println("ODD NUMBER");
  }
}

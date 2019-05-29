import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum = 0,temp = n;
      while(n>0)
      {
        int rem = n%10;
        n = n/10;
        sum = sum + rem*rem*rem;
      }
      if(temp == sum)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
    }
}
      
import java.util.Scanner;
class Main {
	public static void main (String[] args){
	 Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int LD = n%10;
      while(n >= 10)
      {
        n = n/10;
      }
      int FD = n;
      int sum = FD + LD;
      System.out.println(sum);
	}
}
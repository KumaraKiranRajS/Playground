import java.util.Scanner;
class Main {
	public static void main (String[] args){
	 Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sdigit = 0;
      while(n >= 10)
      {
        sdigit = n%10;
        n = n/10;
      }
      System.out.println(sdigit);
    }
}
import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
	  int n = in.nextInt();
      int sq = square_of_numbers(n);
      n=sq;
	  System.out.print(n);
	}
    // Function to find the sum of numbers
	public static int square_of_numbers(int y)
	{
	    int square;
	    square = y*y;
	    return square;
	}
} // End of Main class
import java.util.*;
import java.lang.Math;
class Main{
      public static double power_of_number(int m1,int m2){
        double result = Math.pow(m1,m2);
        return result;
      }
      public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        double power = power_of_number(n1,n2);
        System.out.println(power);
      }
}
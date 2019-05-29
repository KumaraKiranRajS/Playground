import java.util.*;
class Main{
public static boolean isPrime(int number){
          int i;
          boolean flgPrime=true;
          for(i=2; i<=number/2; i++){
              if(number%i==0){
                  flgPrime=false;
                  break;
              }
          }
          return flgPrime;
      }
      public static void main(String args[]){
          int loop,n;
          Scanner SC=new Scanner(System.in);
          n=SC.nextInt();
          for(loop=2; loop<=n; ++loop){
              if(isPrime(loop)){
                  System.out.println(loop);
              }
          }
      }
}
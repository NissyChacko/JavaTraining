import java.util.*;
public class multiplicationWhile 
 {
     public static void main(String[] args)
     {
         Scanner scan=new Scanner(System.in);
         // variable declerations
         System.out.println("Multiplication Table");
         System.out.println("Enter your Number");
         int Nbr=scan.nextInt();
          System.out.println("Enter your limit");

        int Lmt=scan.nextInt();
        int i=1;//lower limit
         while(i<=Lmt)
         {
           System.out.printf("\t%d * %d = %d\n",Nbr,i,Nbr*i);
           i++; 
        }
       



     }
 }
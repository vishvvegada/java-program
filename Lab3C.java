import java.util.Scanner;

public class Lab3C {
    public static void main(String[] args) {
         Scanner b= new Scanner(System.in);
         System.out.println("Enter number 1:");
         int a1=b.nextInt();
         System.out.println("Enter number 2:");
         int a2=b.nextInt();
         System.out.println("Enter number 3:");
         int a3=b.nextInt();
         if(a1>a2){
            if(a1>a3){
                System.out.println("Number 1 is greater");
            }
            else{
                System.out.println("NUmber 3 is greater");
            }
         }
         else{
            if(a2>a3){
                System.out.println("Number 2 is greater");
            }
            else{
                System.out.println("Number 3 is greater");
            }
         }

    }
}

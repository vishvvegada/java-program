import java.util.Scanner;
public class Lab2C {
    public static void main(String[] args) {
            Scanner b= new Scanner(System.in);
            System.out.println("Enter first integer");
            int n1=b.nextInt();
            System.out.println("Enter second integer");
            int n2=b.nextInt();
            System.out.println("Enter action for perform:");
            char n3=b.next().charAt(0);
             
            if (n3=='*') {
                double sum =(double)n1*n2;
                System.out.println(sum);
            }
            else if (n3=='+') {
                double sum=n1+n2;
                System.out.println(sum);
            }
            else if (n3=='/') {
                double sum=(double)n1/n2;
                System.out.println(sum);
            }
            else if (n3=='-') {
                double sum=(double)n1-n2;
                System.out.println(sum);
            }
            else{
                System.out.println("invalid action");
            }




         
    }
    
}

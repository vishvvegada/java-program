import java.util.Scanner;
public class Lab2CSwitch {
    

    public static void main(String[] args) {
            Scanner b= new Scanner(System.in);
            System.out.println("Enter first integer");
            int n1=b.nextInt();
            System.out.println("Enter second integer");
            int n2=b.nextInt();
            System.out.println("Enter action for perform:");
            char n3=b.next().charAt(0);
             
            switch (n3) {
                case '*':
                double sum =(double)n1*n2;
                System.out.println(sum);
                    
                    break;
                case '/':
                double sum1=(double)n1/n2;
                System.out.println(sum1);
                    break;
                case '+':
                double sum2=(double)n1+n2;
                System.out.println(sum2);
                    break;
                case '-':
                double sum3 =(double)n1-n2;
                System.out.println(sum3);
                 break;
            
                default:
                    break;
            }
            

         
    }
    
}

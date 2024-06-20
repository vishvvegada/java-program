import java.util.Scanner;

public class Lab3B {
    public static void main(String[] args) {
        Scanner b= new Scanner(System.in);
            System.out.println("Enter first integer");
            int n1=b.nextInt();
            System.out.println("Enter second integer");
            int n2=b.nextInt();
            System.out.println("Enter third integer");
            int n3=b.nextInt();
            if(n2>n3){
                if(n2>n1){
                    System.out.println(n2);
                }
                else{
                    System.out.println(n1);
                }
            }
            else{
                if(n3>n1){
                    System.out.println(n3);
                }
                else{
                    System.out.println(n1);
                }
            }
    }
}

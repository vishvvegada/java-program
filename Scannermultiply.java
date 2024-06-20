import java.util.Scanner;
public class Scannermultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer:");
        int n=sc.nextInt();
        System.out.println("Enter your name: ");
        String name=sc.next();
        System.out.println(n);
        System.out.println(name);
        System.out.println("Enter Integer 1:");
        int n1=sc.nextInt();
        System.out.println("Enter Integer 2:");
        int n2=sc.nextInt();
        int multi=n1*n2;
        System.out.println(multi);
    }
    
}

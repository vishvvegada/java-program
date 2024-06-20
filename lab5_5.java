import java.util.Scanner;
class Complax{
    void add(double x,double y,double x1,double y1){
        System.out.println("The complax no. is : "+x+" + "+y+"i");
        
        System.out.println("The complax no. is : "+x1+" + "+y1+"i");
        double x2= x+x1;
        double y2=y+y1;
        System.out.println("The addition of privios complax nos. is : "+x2+" + "+y2+"i");

    }

}
public class lab5_5 {
    public static void main(String[] args) {
        Complax s = new Complax();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the real part of complex no. : ");
        double x = sc.nextDouble();
        System.out.print("Enter the immaginary part of complex no. : ");
        double y = sc.nextDouble();
        System.out.print("Enter the real part of 2nd complex no. : ");
        double x1 = sc.nextDouble();
        System.out.print("Enter the immaginary part of 2nd complex no. : ");
        double y1 = sc.nextDouble();
        s.add(x,y,x1,y1);
       
    }
    
}

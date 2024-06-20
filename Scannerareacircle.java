import java.util.Scanner;
public  class Scannerareacircle{

    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int n =b.nextInt();
        double area =n*n*3.14;
        System.out.println(area);

    }

}
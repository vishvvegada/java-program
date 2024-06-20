class Area{
    double areaOfCircle(int r){
        double area = (Math.PI)*(r)*(r);
        return area;
    }
}
public class Lab5_1{
    public static void main(String[] arg){
        Area sc = new Area();
        double a = sc.areaOfCircle(8);
        
        System.out.println("The area of circle is : "+a);

    }
    
}
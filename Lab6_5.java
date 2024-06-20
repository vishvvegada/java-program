
public class Lab6_5 extends MyPoint {
    private double z; // Represents the z-coordinate


    public Lab6_5() {
        super(); 
        this.z = 0;
    }

    
    public Lab6_5(double x, double y, double z) {
        super(x, y); 
        this.z = z;
    }

    
    public double getZ() {
        return z;
    }

    
    @Override
    public double distance(MyPoint other) {
        if (other instanceof Lab6_5) {
            Lab6_5 other3D = (Lab6_5) other;
            double dx = getX() - other3D.getX();
            double dy = getY() - other3D.getY();
            double dz = z - other3D.getZ();
            return Math.sqrt(dx * dx + dy * dy + dz * dz);
        } else {
            throw new IllegalArgumentException("Invalid point type");
        }
    }

    public static void main(String[] args) {
        Lab6_5 point1 = new Lab6_5(0, 0, 0);
        Lab6_5 point2 = new Lab6_5(10, 30, 25.5);

        System.out.println("Distance between the two points: " + point1.distance(point2));
    }
}

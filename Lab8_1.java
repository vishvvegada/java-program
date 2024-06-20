public class Lab8_1 {
    public static void main(String[] args) {
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            if (y < 0) {
                throw new IllegalArgumentException("Exponent must be non-negative.");
            }

            System.out.println(power(x, y));
        } 
         catch (NumberFormatException e) {
            System.out.println("Both arguments must be integers.");
         } 
         catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
         }
    }

    public static int power(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
}

import java.util.Scanner;

public class Lab4A{
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int arr[]= new int[2];
       int sum=0,i;
       for(i=0;i<2;i++){
        arr[i]=sc.nextInt();
        sum=sum+arr[i];
        
       }
       System.out.println(sum);
    
    }
}

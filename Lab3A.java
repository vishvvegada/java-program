import java.util.Scanner;

public class Lab3A {
    public static void main(String[] args) {
     Scanner b= new Scanner(System.in);
         System.out.println("Enter string:");
         String st=b.next();
         String rev="";
            for(int i=(st.length())-1;i>=0;i--){
                rev =rev+st.charAt(i);
            } 
                if(st.equals(rev)){
                System.out.println("Palindrom");
                 }
            else{
                System.out.println("Not Palindrom");
            }     

    }
}

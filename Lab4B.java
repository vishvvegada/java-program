import java.util.Scanner;

public class Lab4B {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter a line:");
         String n=sc.next();
         int vowel=0,constant=0;
         for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                   vowel++;
            }
            else{
                constant++;
            }
         }
         System.out.print("vowel:");
         System.out.println(vowel);
         System.out.print("Constant:");
         System.out.println(constant);


    }
    
}

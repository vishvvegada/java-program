import java.util.Scanner;
class vowel{
    int a=0,e=0,i=0,o=0,u=0;

    void counter(String s,int vov){
      
        for(int m = 0;m<s.length();m++){
            if(s.charAt(m)=='A'||s.charAt(m)=='a'){
                a++;
            }
            else if(s.charAt(m)=='E'||s.charAt(m)=='e'){
                e++;
            }
            else if(s.charAt(m)=='i'||s.charAt(m)=='I'){
                    i++;
            }
            else if(s.charAt(m)=='o'||s.charAt(m)=='O'){
                o++;
            }
            else if(s.charAt(m)=='U'||s.charAt(m)=='u'){
                u++;
        }

    }
    }
    }


public class Lab5_3B {
    public static void main(String[] args) {
        int vov=0;
        vowel v=new vowel();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        while(true){
           
            String S1=sc.nextLine();
            if(S1.equalsIgnoreCase("quit")){
                break;
            }

            else{
                v.counter(S1, vov);
            }
            System.out.println("Enter a new string:");
            
    }
    System.out.println("num of a is"+v.a);
    System.out.println("num of e is"+v.e);
    System.out.println("num of i is"+v.i);
    System.out.println("num of o is"+v.o);
    System.out.println("num of u is"+v.u);
}
}
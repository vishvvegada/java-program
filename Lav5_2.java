 import java.util.Scanner;
 class Time{
     Time(){
         int minute=120;
         int minutes2=130;

     }
     void count(int minute,int minutes2){
        
         int houre = 0;
         while(minute>=60){
             houre=minute/60;
             minute%=60;
            
         }
         System.out.println(houre+" houre "+minute+" minutes" );
         int houre2 = 0;
         while(minutes2  >=60){
             houre2=minutes2/60;
             minutes2%=60;
            
         }
         System.out.println(houre2+" houre "+minutes2+" minutes" );
        
         Time a = new Time();
         a.add(houre,minute,houre2,minutes2);
        
     }
     int add(int houre,int minute,int houre2,int minutes2){   
         int houre3 = houre + houre2;
         int minutes3 = minutes2 + minute;
         while(minutes3>=60){
             houre3+=minutes3/60;
             minutes3%=60;
            
         }
         System.out.println("The addition of privious minutes is "+houre3+" houre "+minutes3+" Minutes");
        
         return 0;

     }
 }
 public class Lav5_2 {
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.print("Enter the minute :");
         int minute = sc.nextInt();
         System.out.print("Enter 2nd minutes : ");
         int minutes2 = sc.nextInt();
         Time a = new Time();
         a.count(minute,minutes2);
        
        
        
    
     }
 }

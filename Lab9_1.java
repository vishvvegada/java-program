public class Lab9_1 {
    public static void main(String[] args) {
       Runnable r1=new PrintMessage("good morning", 1000);
       Runnable r2=new PrintMessage("good afternoon", 3000);
       Thread gm=new Thread(r1);
       Thread ga=new Thread(r2);
       gm.start();
       ga.start();
    }
    
}

class PrintMessage implements Runnable{
    String msg;
    int delay;
    public PrintMessage(String msg,int delay){
            this.msg=msg;
            this.delay=delay;
    }
    
    public void run(){
        try{
            while (true) {
               System.out.println(msg);
               Thread.sleep(delay); 
            }
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
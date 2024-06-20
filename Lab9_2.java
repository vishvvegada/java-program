public class Lab9_2 {
    public static void main(String[] args) {
        Thread odd=new PrintMessage(1,1000);
        Thread even=new PrintMessage(2,14000);
        odd.start();
        even.start();
    }
}
 
class PrintMessage extends Thread{
    int number;
    int delay;
    public PrintMessage(int number,int delay){
        this.number=number;
        this.delay=delay;
    }
    public void run(){
        try{
            for(this.number=number;number<=20;number+=2){
                System.out.println(number);
                Thread.sleep(delay);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
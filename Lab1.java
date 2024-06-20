public class Lab1{
    public static void main(String[] args) {
        System.out.println("Name:"+args[0]);
        System.out.println("Sem:"+args[1]);
        System.out.println("RollNo:"+args[2]);
        System.out.println("Branch:"+args[3]);
        int a=Integer.parseInt(args[1]);
        int b=Integer.parseInt(args[2]);
        int sum=a+b;
        System.out.println(sum);
    }
    
}

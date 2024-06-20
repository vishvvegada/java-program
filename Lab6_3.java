

public class Lab6_3{

    public static void main(String[] args){
        Employee e1=new Employee("vishv", 17, "989865743", "dhoraji", 1000,"c+");
        Manager m1=new Manager("vishv", 17, "989865743", "dhoraji", 1000,"CSE");
        Member m2=new Member("dhairy",18,"78865678","ahmedabad",10000);
        e1.printDetails();
        m1.printDetails();
        m2.printDetails();
    }
    
}

class Member{
     String name;
     int Age;
     String phone_number;
     String address;
     int Salary;
    Member(String name,int Age,String phone_number,String address,int Salary){
        this.name=name;
        this.Age=Age;
        this.phone_number=phone_number;
        this.address=address;
        this.Salary=Salary;
    }
    void printDetails(){
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.Age);
        System.out.println("Phone number:"+this.phone_number);
        System.out.println("address:"+this.address);
        System.out.println("Salary:"+this.Salary);

    }
  
}

class Employee extends Member{
    String specializtion;
    Employee(String name,int Age,String phone_number,String address,int Salary,String specializtion){
       super(name, Age, phone_number, address, Salary);
        this.specializtion=specializtion;
    }
    @Override
    void printDetails() {
        super.printDetails();
        System.out.println("specialization:"+this.specializtion);
    }
}

class Manager extends Member{
    String department;
    Manager(String name,int Age,String phone_number,String address,int Salary,String department){
        super(name, Age, phone_number, address, Salary);
        this.department=department;
    }
    @Override
    void printDetails(){
        super.printDetails();
        System.out.println("department"+this.department);
    }
}
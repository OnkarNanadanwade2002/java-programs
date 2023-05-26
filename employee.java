import java.util.Scanner;

class employee{
    String first_name;
    String last_name;
    int sal;
   public void getdata()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the name :");
        first_name=s.nextLine();
        System.out.println("enter the last name :");
        this.last_name=s.nextLine();
        System.out.println("enter the salary :");
        this.sal=s.nextInt();
        s.close();
    }
    public void display()
    {
        // Scanner s=new Scanner(System.in);
        System.out.println(" the name :" +first_name );
        // first_name=s.nextLine();
        System.out.println(" the last name :" + last_name);
        // this.last_name=s.nextLine();
        System.out.println(" the salary :"+ sal);
        // this.sal=s.nextInt();
        // s.close();
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        employee obj=new employee();
        obj.getdata();
        obj.display();
        sc.close();

    }
}

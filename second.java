import java.util.Scanner;
import java.util.ArrayList;
import javax.sound.sampled.SourceDataLine;

/*
import java.util.Scanner;

import javax.swing.plaf.synth.SynthTabbedPaneUI;

class second
{
   public  String name ;
   public String lname;
   public  int monthsal;
    void get(String fname,String Lname,int sal)
    {
        // System.out.println("enter the employee name :");
        this.name=fname;
        this.lname=Lname;
        this.monthsal=sal;
        

    }
    void display()
    {
        System.out.println(" name " +name);
        System.out.println("last name :" + lname);
        System.out.println(" monthly salary :"+ monthsal );
    }
public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
    second obj=new second();
    obj.get("prasad"," shenavi",40000);
    obj.display();





}
}

*/























// import java.util.Scanner;

/*
import java.util.Scanner;

public class second{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("enter the size :");
        n=s.nextInt();
        System.out.println("enter the data in the araray :");
        int[] arr=new int[10];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("data in the araray :");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
*/
/*
public class second
{
    public static void main (String []arges)
    {
        String name = "sangram";
        String name_1 = "anup";
    }
}
*/

/*
import java.util.Scanner;

class second 
{
    public static void main (String []args)
    {
        int num;
        System.out.println("\n\t\t enter the integer : ");

        Scanner s= new Scanner(System.in);
        num =s.nextInt ();
        System.out.println(" entered integer is : " + num);
    }
}
*/
// import java.util.Scanner;
/*
 class second 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the size of array :");
        n=sc.nextInt();
        int[] arr=new int[20];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("\n dat in the array :");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }

    }
}


*/
/*
class second{
    String name;
    int x;
    public void printing()
    {
        System.out.println(" your name is :" + name);
        System.out.println("and your age is :" + x);
    }
    public static void main(String args[])
    {
        second obj=new second();
        // second obj =new second();
        // obj.name="omkar";
        // obj.x=20;
        // obj.printing();
        Scanner sc=new Scanner(System.in);
        System.out.println("\n enter your name :");
        obj.name=sc.nextLine();
        System.out.println("\n enter your age ");
        obj.x=sc.nextInt();
        obj.printing();
        sc.close();
    }
}
*/
/*
class second{
    public int checkplaindrom(int x,int len)
    {
        int s=0, e=len;
        while(s<e)
        {
            if(s!=e)
            {
                System.out.println(" number is not palindrome :");
                System.out.println(" place os s :" + s +" place of e :" + e);
                break;
            }
            else{
                s++;
                e--;
            }

        }
        return(0);
        

    }
    public int countlen(int x)
    {
        int count=0;
        while(x!=0)
        {
            // x=x%10;
            count++;
            x=x/10;
        }
        return count;
    }
    public static void main(String args[])
    {
        second obj =new second();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the any number for checking palindrome :");
        int x=sc.nextInt();
        System.out.println("\n counting the length of string :");
        int len=obj.countlen(x);
        System.out.println("lenght :" + len);
        System.out.println("\n checking the palindeome :");
        obj.checkplaindrom(x,len);
        sc.close();;
        


    }
}*/
/*
class employeedetails
{
    int id,sal;
    String name,add,depart,email;

    public int id()
    {
        return id;
    }
     public void setid(int id)
    {
        this.id=id;
    }

    public int getsal()
    {
        return sal;
    }
    public void setsal(int sal)
    {
        this.sal=sal;
    }

    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name=name;
    }


    public String getadd()
    {
        return add;
    }
    public void setadd(String add)
    {
        this.add=add;
    }

    public String getdepart()
    {
        return depart;
    }
    public void setdepart(String depart)
    {
        this.depart=depart;
    }


    public String getemail()
    {
        return email;
    }
    public void setemail(String email)
    {
        this.email=email;
    }


    public String toString()
    {
        return "employee [id= "+ id +",sal = "+ sal + ", name  " + name + " add "+ add +", department "+depart+
        ", email = "+email+ "]"; 
    }
}

  public class second
{
    int abc,xyz;
    void addition()
    {
        int sum=abc+xyz;

        System.out.println(" sum" + sum);

    }
  public static void main(String args[])

  {
    employeedetails obj = new employeedetails();
    second obj2=new second();
    obj2.abc=10;
    obj2.xyz=20;
    obj2.addition();

    obj.setname("sangram");
    obj.setid(59);
    obj.setadd("radhanagari");
    obj.setdepart("cse");
    obj.setsal(100000);
    obj.setemail("sangrampatil6447@gmail.com");

    System.out.println(obj);


  }
}*/
/*

class second 
{
    public static void main(String args[])
    {
        // Scanner sc=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("ENTER THE NO. FOR N : ");
        n =sc.nextInt();
        // System.out.println(" n =" +n);
        // sc.close();
        int[] arr=new int[20];
        System.out.println("enter the array elements :");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        int max=0,min=700;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("maximum :" + max);
        System.out.println("minimum :" + min);


    }
}
*/
/*
class second 
{
    public static void main (String args[])
{
    System.out.println("sangram");
}
    
}
*/
/*
class second 
{
    public static void main (String args[])
    {
        // int n1,n2;
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        System.out.println(" the no. is : " +n1);
        sc.close();
    }
}
*/
/*
class second 
{
    public static void main (String args [])
    {
         int n1,n2;
         Scanner sc=new Scanner(System.in);
         System.out.println("\n\t\t ENTRE THE NO : ");
         n1 =sc.nextInt();
         n2 =sc.nextInt();
         System.out.println(" \n\t\t SUM OF TWO NO : " +(n1+n2));
         sc.close();
    }
}
*/
/*
class second 
{
    public static void   main (String args [])
    {
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("size of array ");
        n=sc.nextInt();
        int[] arr=new int[20];
        System.out.println("ENTER THE ARRAY ELEMENT");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min =arr[0];
        for(i=0;i<n;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("min ="+ min);
        sc.close();
    }
}
*/
/*
class employee
{
    int id;
    String name;
    float salary;
    Scanner sc1=new Scanner(System.in);
    public void getdata()
    {
        System.out.println("enter your id");
        id=sc1.nextInt();
        System.out.println("enter your name ");
        name=sc1.next();
        System.out.println("salary");
        salary=sc1.nextFloat();
        
    }
    public void show()
    {
        System.out.println("name : "+name);
        System.out.println("id : "+ id);
        System.out.println(" salary : "+ salary);
    }



}
class second{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("no of emp :");
        int n=sc.nextInt();
        employee[] em=new employee[5];
        for(int i=0;i<n;i++)
        {
            em[i]=new employee();
            em[i].getdata();
        }
        System.out.println("data of all employes :");
        for(int i=0;i<n;i++)
        {
            em[i].show();
        }
      sc.close();
        

    }
}
*/
/*
class student{
    int rollno;
    String name;
   public float per;
    Scanner em=new Scanner(System.in);
    public student()
    {
        System.out.println(" roll no :");
        rollno=em.nextInt();
        System.out.println(" name :");
        name=em.next();
        System.out.println("percentage :");
        per=em.nextFloat();
    }
    public void display()
    {
        System.out.println(" roll No " + rollno);
        System.out.println(" name :" + name );
        System.out.println("percentage " + per);

    }
}

class second{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the number of student :");
        int n=sc.nextInt();
        student st1=new student();
        student st2=new student();
        student st3=new student();

        
        for(int i=0;i<n;i++)
        {
            st[i]=new student();
            st[i].getdata();
        }
        
        float max=st1.per;
        int ind=-1;
        for(int i=0;i<3;i++)
        {
            if(max<st[i].per)
            {
                max=st[i].per;
                ind=i;
            }
        }
        st[ind].display();
        sc.close();

 }
}
*/
/*
class employee
{
    int id;
    String name;
    float salary;
    Scanner sc1=new Scanner(System.in);
    public void get()
    {
        System.out.println("enter the name : ");
        name=sc1.next();
        System.out.println("enter id no. : "+id);
        id=sc1.nextInt();
        System.out.println("enter salary : ");
        salary=sc1.nextFloat();
    }
    public void show()
    {
        System.out.println("name : "+ name);
        System.out.println("id : "+id);
        System.out.println("salary"+salary);
    }
}
class second 
{
    public static void main ()
    {
        int i;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        employee[] em=new employee[10];
        for(i=0;i<n;i++)
        {
            em[i]=new getdata();
            em[i].getdata();
            
        }

        
        
    }
}

*/
/*
class second 
{
    public static void main(String args[])
    {
        System.out.println("hello");
    }
}
*/
/*
class second{
    public static void main (String args[])
    {
        int n;
       Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
       System.out.println(" the entered no. is : " + n);
    }
}
*/
/*
class second{
    public static void main(String args[])
    {
        int n1,n2;

        Scanner sc =new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        System.out.println("the addtion is : "+(n1+n2));
    }
}
*/
/*
class second 
{
    public static void main (String args[])
    {
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();

        if(n1>n2)
        {
            System.out.println("this no. is larger : "+ n1);
        }
        else
        {
            System.out.println("this no. is larger : "+ n2);
        }
    }
}
*/
class employee{
  int id;
  String name;
  float salary;
  Scanner sc1=new Scanner(System.in);
  public void get()
  {
    System.out.println("enter name : ");
    name=sc1.nextLine();
    System.out.println("enter id");
    id=sc1.nextInt();
    System.out.println("enter salary : ");
    salary=sc1.nextFloat();
  }
  public void show()
  {
    System.out.println("name : "+name);
    System.out.println("id : "+id);
    System.out.println("salary "+salary);
  }

}

class second
{
    public static void main(String args[])
    {
        System.out.println("enter no. of employee");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        employee[] em=new employee[5];
        for(int i=0;i<n;i++)
        {
        // employee    em[i]=new empolyee();
            em[i].get();

        }
        for(int i=0;i<n;i++)
        {
            em[i].show();
        }
        sc.close();
        em.clone();


        
    }   
}
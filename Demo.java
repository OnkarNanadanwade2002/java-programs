import java.util.Scanner;

class second 
{
    public static void main()
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
        int max=0,min=0;
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
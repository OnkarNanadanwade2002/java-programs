// Main Program
import Mathematical.variance;
import java.util.Scanner;
import Mathematical.mean1;
import Mathematical.conversion.BinaryToDecimal;
import Mathematical.conversion.DecToHex;
public class TestPack {
 public static void main(String[] args) {
 int Arr[]=new int[50];
 int n;
 Scanner Sc=new Scanner(System.in);
 System.out.println("Enter the Size of Array :");
 n=Sc.nextInt();
 System.out.println("Enter "+n+"Array Elements :");
 for(int i=0;i<n;i++)
 {
 Arr[i]=Sc.nextInt();
 }
 // int Arr[]={20,45,65,43,85,99};
 //int n=6;
 Mean M=new Mean();
 M.CalculateMean(Arr,n);
 Variance V=new Variance();
 V.CalculateVariance(Arr,n);
 BinaryToDecimal BTD=new BinaryToDecimal();
 BTD.CalBinaryToDecimal(10101010);
 DecToHex DTH=new DecToHex();
 DTH.CalDecimalToHex(34);
 }
}
// Main Program
import Mathematical.Variance;
import java.util.Scanner;
import Mathematical.Mean;
import Mathematical.convert.BinaryToDecimal;
import Mathematical.convert.DecimalToHex;
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
 DecimalToHex DTH=new DecimalToHex();
 DTH.CalDecimalToHex(34);
 }
}
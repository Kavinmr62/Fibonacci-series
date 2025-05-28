import java.util.*;
public class fibonacci{
public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a=0;
    int b=1;
    System.out.print(a+","+b);
    for(int i=2;i<n;i++)
    {
     int c=a+b;
     System.out.print(","+c);
     a=b;
     b=c;
    }
}}

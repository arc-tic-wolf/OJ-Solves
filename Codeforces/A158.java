import java.util.*;
public class A158{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        while(sc.hasNextInt()){
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int [n];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        
        for (int i=0;i<a.length;i++){
             if (a[i]>=a[k-1] && a[i]>0){
                sum++;
             }
           }
         
        System.out.println(sum);
        }
    }
}
import java.util.*;public class BhaskarFormula
{
    public static void main(String[] args) {
Scanner sc=new Scanner( System.in);
 double a=sc.nextDouble();
 double b=sc.nextDouble();
 double c=sc.nextDouble();
 if ((b*b-4*a*c)<0||a==0){
 System.out.println("Impossivel calcular");}
 else {
 double r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
 double r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
 System.out.printf("R1 = %.5f\n",r1);
 System.out.printf("R2 = %.5f\n",r2);
 }
    }}
import java.util.*;
public class score{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        double sum=0;
        outer :for (int i=1;i<=2;){
            double d=sc.nextDouble();
            if (d<0 || d>10){
                System.out.println("nota invalida");
                continue outer;
            }
            sum+=d;
            i++;
        }
        System.out.printf("media = %.2f\n",sum/2.0);
        for (;;){
            int x=sc.nextInt();
            System.out.println("novo calculo (1-sim 2-nao)");
            sum=0;
            if (x==2){
                break;
            } else if (x==1){
                outer :for (int i=1;i<=2;){
                  double d=sc.nextDouble();
                  if (d<0 || d>10){
                    System.out.println("nota invalida");
                    continue outer;
                  }
                  sum+=d;
                  i++;
                }
                System.out.printf("media = %.2f\n",sum/2.0);
            } 
        }
    }
}

        
            
                
                
        
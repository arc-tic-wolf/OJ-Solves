import java.util.*;

public class VanyaAndBooks {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        long digit=0;
        long d=t;
        while(d>0){
            d/=10;
            digit++;
        }


        long ans=0;
        long c=1;
        for(int i=1; i<digit; ++i){
            ans+=c*i*9;
            c*=10;
        }
        ans += (t-c+1)*digit;
        System.out.println(ans);



    }
}
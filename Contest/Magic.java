import java.util.*;

public class Magic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s=Integer.toString(t);


        s=s.replaceAll("144","");
        s=s.replaceAll("14","");
        s=s.replaceAll("1","");
        if(s.equals("")){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}

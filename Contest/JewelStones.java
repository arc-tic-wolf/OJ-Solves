import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class JewelStones {


    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader c = new BufferedReader(r);
        int n=Integer.parseInt(c.readLine());
        for(int k=1;k<=n;k++) {
            String j = c.readLine();
            String s = c.readLine();
            int sum=0;
            for (int i = 0; i < s.length(); i++) {
                for(int l=0;l<j.length();l++){
                    if(s.charAt(i)==j.charAt(l)){
                        sum++;
                        break;
                    }
                }


            }
            System.out.println(sum);
        }

    }
}

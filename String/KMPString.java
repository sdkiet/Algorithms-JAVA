import java.util.*;
import java.awt.Point;
import java.lang.Math; 
import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.Comparator;
import java.util.stream.IntStream;
     
    public class KMPString {
         static int oo = (int)1e9;
      public static void main(String[] args) {
    	    InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            Scanner in = new Scanner(inputStream);
            PrintWriter out = new PrintWriter(outputStream);
            Musk solver = new Musk();
            solver.solve(1, in, out);
            out.close();
    	}
    	
    static class Musk {
       
       static int inf = (int) 1e9 + 7;
       int f[];
       public void solve(int testNumber, Scanner in, PrintWriter out) {
                   String T = in.next();
                   String P = in.next();
                   KMP(T,P);
       }

       public void KMP(String T, String P){
            f= new int[P.length()];
            prefix_table(P);

            int n = KMPos(T,P);
            if(n==-1){
                System.out.println("MAth Not Found !");
            }else{
                System.out.println("Match Found At "+n);
            }
       }

       public void prefix_table(String P){
           int i=1,j=0,m=P.length();
           f[0]=0;
           while(i<m){
               if(P.charAt(i)==P.charAt(j)){
                   f[i]=f[j]+1;
                   i++;
                   j++;
               }else if(j>0){
                   j=f[j-1];
               }else{
                   f[i]=0;
                   i++;
               }
           }
       }

       public int KMPos(String text, String pat){
           int i = 0, j = 0;
        int lens = text.length();
        int lenp = pat.length();
        while (i < lens && j < lenp)
        {
            if (text.charAt(i) == pat.charAt(j))
            {
                i++;
                j++;
            }
            else if (j == 0)
                i++;
            else
                j = f[j - 1] + 1;
        }
        return ((j == lenp) ? (i - lenp) : -1);
       }
    }  
}           
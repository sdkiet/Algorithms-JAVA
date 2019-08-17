import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Binary 
{ 
  static int search(int A[], int L , int R , int M) 
  { 
	if(L<=R){
          int Mid = L+(R-L)/2;
           if(A[Mid]==M){
            return Mid;
           }
           if(A[Mid]>M){
            return search(A , L , Mid-1,M);
           }
           if(A[Mid]<M){
            return search(A , Mid+1 , R, M);
           }
                 
        } 
      return -1;
  } 

   public static void main(String args[]) { 
	Scanner sc = new Scanner(System.in); 
	int N = sc.nextInt();
        int M = sc.nextInt();
	int[] A =new int[N];
   
        for(int i =0;i<N;i++){
          A[i] = sc.nextInt();  
        }
        int L = A[0];
        int R = A[N-1];
	int result = search(A,L,R,M); 
         System.out.println(result); 
   } 
} 


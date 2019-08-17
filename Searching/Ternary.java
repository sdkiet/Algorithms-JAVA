import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Ternary 
{ 
  static int search(int A[], int L , int R , int M) 
  { 
	if(L<=R){
          int Mid1 = L+(R-L)/3;
          int mid2 =R-(R-L)/3
           if(A[Mid1]==M){
            return Mid;
           }
           if(A[Mid2]==M){
            return Mid2;
           }
           if(A[Mid1]>M)
            return search( A , L , Mid1-1,M);
           else if(A[Mid2]<M)
            return search(A , Mid2+1 , R, M);
           else
            return search(A , Mid1+1 , Mid2-1 ,M);
                 
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


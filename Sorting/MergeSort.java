import java.io.*;
import java.util.*;
import java.util.Scanner;

public class MergeSort 
{ 

  public static void Merge(int[] A, int L, int M, int R){

        int n1 = M-L+1; 
        int n2 = R-M; 
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        for (int i=0; i<n1; ++i){ 
            L[i] = A[L+i];
        } 
        for (int j=0; j<n2; ++j){ 
            R[j] = A[M+1+j];
        } 
   
        int i=0, j=0;  
        int k=l; 
        while (i<n1 && j<n2){ 
            if (L[i]<=R[j]){
                A[k]=L[i]; 
                i++; 
            } 
            else{
                A[k]=R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i<n1){ 
            A[k] = L[i]; 
            i++; 
            k++; 
        } 
        while (j<n2){ 
            A[k]=R[j]; 
            j++; 
            k++; 
        } 
    } 
  
  }
  public static void Sort(int A[], int L, int R) 
  { 
	if(L<R) 
	{     
          int M = (L+R)/2;
          Sort(A,L,M);    
          Sort(A,M+1,R);
          Merge(A,L,M,R); 
	} 
  } 

   public static void main(String args[]) { 
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] A =new int[N];
        for(int i =0;i<N;i++){
          A[i] = sc.nextInt();  
        }
	 Sort(A,0,N-1);
         for(int i=0;i<N;i++){ 
          System.out.print(A[i]);
         
         } 
   } 
} 

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class QuickSort 
{ 

  public static void Sort(int A[], int L, int R) 
  { 
    if(L<R){

     int Mid  = Partition(A,L,R);
     
     Sort(A,L,Mid-1);
     Sort(A,Mid+1,R);

    }

  } 

  public static int Partition(int A[],int L, int R){
     int x = A[L];
     int j = L;
     int temp=0;
    for(int i=L+1;i<=R;i++){
        if(A[i]<=x)
            j++;
      
         temp = A[j]; 
         A[j] = A[i]; 
         A[i] = temp;         
    }   
     temp = A[j];
     A[j] = A[L]; 
     A[L] = temp;

     return j;
  }

   public static void main(String args[]) { 
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] A =new int[N];
        for(int i =0;i<N;i++){
          A[i] = sc.nextInt();  
        }
	 Sort(A, 0, N-1);
         for(int i=0;i<N;i++){ 
          System.out.print(A[i]);
         
         } 
} 

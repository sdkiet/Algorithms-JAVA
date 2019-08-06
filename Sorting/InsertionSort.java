import java.io.*;
import java.util.*;
import java.util.Scanner;

public class InsertionSort 
{ 
  public static void Sort(int A[]) 
  { 
	for(int i=0; i<A.length-1; i++) 
	{     
              int min = A[i];
               int j = i-1;
	      while(j>=0 && A[j]>min){
                     A[j+1] =A[j];
                     j--;
                 }
           A[j+1] = min;
	} 
  } 

   public static void main(String args[]) { 
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] A =new int[N];
   
        for(int i =0;i<N;i++){
          A[i] = sc.nextInt();  
        }
	 Sort(A);
         for(int i=0;i<N;i++){ 
          System.out.print(A[i]);
         
         } 
   } 
} 

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();
        
        int numberOfSwaps = 0;
        for (int i = 0; i < n; i++) {
          for (int j = 0; j < n - i-1; j++) {
        if (arr[j] > arr[j + 1]) {
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=arr[j];
            
            numberOfSwaps++;
        }
    }
    
    if (numberOfSwaps == 0) {
        break;
        }
    }
       System.out.println("Array is sorted in " + numberOfSwaps + " swaps."); 
        System.out.println("First Element: " + arr[0]); 
        System.out.println("Last Element: " + arr[n-1]); 
    }
}
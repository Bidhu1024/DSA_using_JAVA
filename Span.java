Span Of Array


1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value. 
    
    
    
    
import java.util.*;

public class Span{
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }


        int max = arr[0];
        int min = arr[0];

        for(int i = 1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }

        }


        int span = max - min;
        System.out.println(span);
        scn.close();
    }
}

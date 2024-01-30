import java.util.Collections;
import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {6,2,8,4,10};
        int n = arr.length;

        for(int i=0;i<n-1;i++)
        {
            int mini_idx = i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[mini_idx] > arr[j])
                {
                    mini_idx = j;
                }
            }

            int temp = arr[mini_idx]; 
            arr[mini_idx] = arr[i]; 
            arr[i] = temp; 
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
